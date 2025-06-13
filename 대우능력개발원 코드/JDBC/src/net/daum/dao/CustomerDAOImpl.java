package net.daum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import net.daum.dto.CustomerDTO;

public class CustomerDAOImpl {//오라클 db연동 클래스
	
	String driver = "oracle.jdbc.driver.OracleDriver";//oracle.jdbc.driver는 패키지명, OracleDriver는 jdbc드라이버 클래스명
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";//오라클 접속 주소, 1521은 오라클 연결 포트번호, xe 는 데이터베이스 이름
	String user = "night";//오라클 접속 사용자
	String pwd = "night";//사용자 비번
	
	Connection con = null;//데이터 베이스 연결 con
	PreparedStatement pstmt = null;//쿼리문 수행 
	ResultSet rs = null;//검색 결과 레로드를 저장할  rs
	String sql = null;//쿼리문(SQL) 저장변수
	
	public CustomerDAOImpl() {
		try {
			Class.forName(driver);//JDBC 드라이버 클래스 로드
		}catch(Exception e) {e.printStackTrace();}
	}//기본생성자
	
	//고객번호 검색
	public CustomerDTO getCus_No(int cus_no) {
		CustomerDTO cusNo = null;
		
		try {
			con = DriverManager.getConnection(url, user, pwd);
			sql = "select cus_no from customer where cus_no=?";//고객번호를 기준으로 DB로 부터 검색
			pstmt = con.prepareStatement(sql);//쿼리문을 미리 컴파일 해서 수행할 pstmt 생성
			pstmt.setInt(1, cus_no);//쿼리문의 첫번째 물음표에 정수 숫자로 고객번호 저장
			rs = pstmt.executeQuery();//검새 쿼리문 수행후 결과 레코드를 rs 에 저장
			if(rs.next()) {//검색된 고객번호가 있다면 참
				cusNo = new CustomerDTO();
				cusNo.setCus_no(rs.getInt("cus_no"));//cus_no컬럼으로 부터 정수숫자로 고객번호를 가져와서 setter()메서드에 저장
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return cusNo;
	}//getCus_No()
}
