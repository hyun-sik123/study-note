package 자바평가시험풀이;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//3번 문제풀이
public class JdbcAnswer_03 {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.OracleDriver";//oracle.jdbc는 패키지명, OracleDriver는 jdbc 드라이버 클래스명
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//오라클 접속주소, 1521은 오라클 연결 포트번호, xe는 데이터베이스명
		String user = "night";//오라클 사용자
		String pwd = "night";//사용자 비번
		
		Connection con = null;//DB연결
		PreparedStatement pstmt = null;//쿼리문 수행
		String sql = null;
		
		try {
			Class.forName(driver);//jdbc드라이버 클래스 로드
			con = DriverManager.getConnection(url, user, pwd);
			Scanner scan=new Scanner(System.in);
			System.out.println(">>>방명록 저장실습<<<");
			System.out.print("작성자 입력>>");
			String gname = scan.nextLine();
			System.out.print("제목 입력>>");
			String gtitle = scan.nextLine();
			System.out.print("내용 입력>>");
			String gcont = scan.nextLine();
			
			sql = "insert into tbl_guestbook7 (gno,gname,gtitle,gcont) values(gno_seq2.nextval,?,?,?)";
			pstmt = con.prepareStatement(sql);//쿼리문을 미리 컴파일해서 수행할 pstmt생성
			pstmt.setString(1, gname);//쿼리문의 첫번째 물음표에 문자열로 작성자를 저장
			pstmt.setString(2, gtitle);
			pstmt.setString(3, gcont);
			
			int re = pstmt.executeUpdate();//저장쿼리문 수행후 성공한 레코드 행의 개수를 반환
			
			if(re == 1)
				System.out.println("방명록 저장성공~");
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//finally
	}
}
