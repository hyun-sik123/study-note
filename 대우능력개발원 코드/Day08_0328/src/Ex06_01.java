/*
 * 06.반복문.pdf No.18쪽 1번문제 풀이
 */
import java.util.Scanner;

public class Ex06_01 {
	public static void main(String[] args) {

		//답안코드
		Scanner scan=new Scanner(System.in);
        
		System.out.print("문자 입력>>");
		String inputString = scan.nextLine();
		System.out.print("반복할 횟수 숫자 입력>>");
		int count = Integer.parseInt(scan.nextLine());
		
	    for(int i=1;i<=count;i++) {
	    	System.out.println(i+"번 "+inputString);
	    }
	}
}
