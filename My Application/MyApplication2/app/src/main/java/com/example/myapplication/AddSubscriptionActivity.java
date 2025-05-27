package com.example.myapplication;  // 네 패키지명 맞게 수정

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AddSubscriptionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // 아래에서 만들 xml 연결
    }
}
