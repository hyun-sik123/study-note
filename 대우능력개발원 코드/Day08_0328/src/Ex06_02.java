/*  06.반복문.pdf No.19쪽 2번문제 풀이
 * 문제)1부터 입력받은 값까지의 홀수 출력하는 프로그램 작성(단,하나는 for반복문에서 1씩증가 해야 하고 반복문 안에서 if문과 %나머지 연산
 * 을 사용해야 한다. 또 다른 하나 for반복문은 2씩 증가해야 한다.)
 */

import java.util.Scanner;

public class Ex06_02 {
	public static void main(String[] args) {
		//for 반복문 사용
		Scanner scan = new Scanner(System.in);	
		System.out.print("숫자 입력>>");
		int count = Integer.parseInt(scan.nextLine());
		
		//1씩증가 되는 경우
		for(int i=1;i<=count;i++) {
			if(i % 2 == 1) {//홀수 일때 실행
				System.out.print(" "+i);
			}
		}//for
		System.out.println("\n ===============>\n");
		
		//2씩 증가되는 경우
		for(int i=1;i<=count;i+=2) {
			System.out.print(" "+i);
		}
	}
}
