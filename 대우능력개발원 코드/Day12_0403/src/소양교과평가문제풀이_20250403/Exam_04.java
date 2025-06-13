package 소양교과평가문제풀이_20250403;

public class Exam_04 {
	/*  문제 4) while 반복문을 사용하여 7단 구구단이 출력되게 자바 코드를 완성하시오. 
	 */
	public static void main(String[] args) {

     //답안코드
	 
	 int k = 7;
	 int i = 1;
	 
	 System.out.println(">>"+k+"단<<");
	 System.out.println("=================");
	 
	 while(i<=9) {
		System.out.println(k+" x "+ i + " = " + (k*i));
		i=i+1;
	 }		
	}
}
