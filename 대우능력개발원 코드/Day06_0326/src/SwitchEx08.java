//switch ~ case 문을 사용해서 주민번호 뒷자리 첫번째 값이 1,3인 경우는 남자, 2,4인 경우는 여자를 구하는 예제)

import java.util.Scanner;

public class SwitchEx08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("샘플 주민 번호 입력(011231-4080212)>>");
		String juminNo = scan.nextLine();
		char regNo = juminNo.charAt(7);//입력받은 주민번호 8번째 단일문자(첫번째 뒷자리 주민번호)=>첫 주민번호 값을 0부터 시작
		
		switch(regNo) {
		 case '1':
		 case '3': System.out.println("당신은 남자 입니다."); break;
		 case '2':
		 case '4': System.out.println("당신의 여자 여자입니다."); break;
		 default : System.out.println("유효하지 않은 주민 번호입니다.");
		}
	}
}
