package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Calendar calendar;
    private GridView calendarGrid;
    private TextView tvMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarGrid = findViewById(R.id.calendarGrid);
        tvMonth = findViewById(R.id.tvMonth);
        Button btnPrevMonth = findViewById(R.id.btnPrevMonth);
        Button btnNextMonth = findViewById(R.id.btnNextMonth);

        calendar = Calendar.getInstance();

        updateCalendar();

        btnPrevMonth.setOnClickListener(v -> {
            calendar.add(Calendar.MONTH, -1);
            updateCalendar();
        });

        btnNextMonth.setOnClickListener(v -> {
            calendar.add(Calendar.MONTH, 1);
            updateCalendar();
        });
    }

    private void updateCalendar() {
        List<String> days = new ArrayList<>();

        // 이번 달 첫 요일 구하기 (빈칸 채우기)
        Calendar tempCal = (Calendar) calendar.clone();
        tempCal.set(Calendar.DAY_OF_MONTH, 1);
        int firstDayOfWeek = tempCal.get(Calendar.DAY_OF_WEEK) - 1; // 일요일=0 기준

        for (int i = 0; i < firstDayOfWeek; i++) {
            days.add(""); // 빈칸
        }

        // 이번 달 날짜 넣기
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= maxDay; i++) {
            days.add(String.valueOf(i));
        }

        // 커스텀 어댑터 적용
        calendarGrid.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return days.size();
            }

            @Override
            public Object getItem(int position) {
                return days.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = convertView;
                if (view == null) {
                    LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                    view = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
                }
                TextView dayText = (TextView) view.findViewById(android.R.id.text1);
                String day = days.get(position);
                dayText.setText(day);
                dayText.setTextSize(16f);
                dayText.setGravity(android.view.Gravity.CENTER);

                // 빈칸이면 글자 투명하게
                if (day.equals("")) {
                    dayText.setTextColor(0x00000000); // 완전 투명
                } else {
                    dayText.setTextColor(0xFF000000); // 검정색
                }
                return view;
            }
        });

        // 월 텍스트 갱신
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월", Locale.getDefault());
        tvMonth.setText(sdf.format(calendar.getTime()));
    }
}
