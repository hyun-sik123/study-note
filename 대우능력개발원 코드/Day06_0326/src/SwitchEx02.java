
import java.util.Scanner;

//if 조건문 관한 실습
public class SwitchEx02 {
	public static void main(String[] args) {
		/* 문제) 스캐너를 사용해서 정수숫자를 입력받은 다음 if 조건문을 활용하여 0을 입력했을때 "입력하신 숫자는 0입니다!" 라고 출력되게
		 * 하고 , 또 다른 if 조건문을 활용해서 0이 아닐때 "입력하신 숫자는 0이 아닙니다!"라고 출력되게 하는 프로그램을 만들어 보자.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 숫자 입력>>");
		int number = Integer.parseInt(scan.nextLine());
		
		if(number == 0)
			System.out.println("입력하신 숫자는 0입니다!");
		
		if(number != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다!");
		}
	}
}
