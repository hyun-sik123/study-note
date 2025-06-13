/* 절대값 반환 메서드: return 
 * 리턴타입이 없는 void형(반환값이 없다)
 */

import java.util.Scanner;

public class MethodEx03 {

	static int abs(int data) {
	   if(data < 0) {
		   data = -data;//양의 절대치
	   }
	   return data;//메서드를 호출한 곳으로 값을 반환
	}//절대값 반환 메서드
	
	static void abs2(int data) {
	   if(!(data < 0)) {
		   System.out.println("양의 정수 숫자만 입력하세요!");		   
	   }else {
		   if(data < 0) {
			   data = -data;
		   }
		   System.out.println("절대값="+data);
	   }
	}//리턴값이 없는 메서드
	
	public static void main(String[] args) {

		Scanner scan = new 	Scanner(System.in);
		System.out.print("음의 정수값 입력>>");
		int negativeInt = Integer.parseInt(scan.nextLine());
		int result = abs(negativeInt);//abs()메서드를 호출하면서 입력받은 값을 전달
		System.out.println(negativeInt+"의 반환된 절대값="+result);
		
		System.out.print("두번째 음의 정수값 입력>>");
		int number = Integer.parseInt(args[0]);//첫번째 문자열 배열원소값을 가져와서 정수 숫자로 변경한다.
		abs2(number);
	}
}






