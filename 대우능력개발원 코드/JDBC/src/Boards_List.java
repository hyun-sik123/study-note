//boards테이블 전체 레코드 가져오기

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Boards_List {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";//oracle.jdbc.driver 는 패키지명,  OracleDriver는 jdbc드라이버
		//클래스명
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";//오라클 접속주소, 1521은 포트번호, xe는 데이터베이스명
		String user = "night";//오라클 사용자
		String password = "night";//사용자 비번
		
		Connection con = null;//db연결
		PreparedStatement pt = null;//쿼리문 수행
		ResultSet rs = null;// 검색  결과 레코드를 저장할 rs
		String sql = null;
		
		try {
			Class.forName(driver);//jdbc 드라이버 클래스 로드
			con = DriverManager.getConnection(url, user, password);//메서드 인자값으로 db접속주소,사용자,비번을 전달해서 
			//db연결 con생성
			sql = "select * from boards order by bno desc"; // 번호를 기준으로 내림차순 정렬하면 큰 숫자번호가 먼저정렬
			pt = con.prepareStatement(sql);//쿼리문을 수행할 pt 생성
			rs = pt.executeQuery();//select 문 수행후 결과 레코드를 rs 에 저장
			System.out.println("no \t name \t title \t cont \t date");
			System.out.println("----------------------------------------------------------------------");
            while(rs.next()) {//next()메서드는 다음 레코드가 존재하면 참
            	System.out.println(rs.getInt("bno")+"\t"+rs.getString("bwriter")+"\t"+rs.getString("btitle")+"\t"+
            rs.getString("bcontent")+"\t"+rs.getDate("bdate"));
            }
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//finally
	}
}
