/* 07장.제어문의 다양한 활용.pdf No.9 4번 구구단 문제 
 */
public class Ex07_04 {
	public static void main(String[] args) {
      //답안코드
	  for(int j=1;j<=9;j++) {
		  for(int i=2;i<=9;i++) {
			  System.out.printf("%d*%d=%d\t",i,j,i*j);//%d는 십진수 정수 출력형태, \t는 탭키만큼 수평
			  //으로 띄움
		  }//inner for
		  System.out.println();//ln()은 줄바꿈
	  }//outer for
	}
}
