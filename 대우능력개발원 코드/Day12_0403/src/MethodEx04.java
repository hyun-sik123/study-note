/* 10장.메서드.pdf No.10 1번문제,2번문제 풀이 
 */

import java.util.Scanner;

public class MethodEx04 {
	
	//1번문제 풀이
    static void name_func(String name) {
    	System.out.println("자기 성이름:"+name);
    }
    
    //2번문제 풀이 코드
    static void gu(int gugudan) {
    	System.out.println(">>>" + gugudan+"단 <<<");
    	
    	for(int i=1;i<=9;i++) {
    		System.out.printf("%d * %d = %d%n", gugudan,i,gugudan*i);
    	}
    }
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("자기 성이름 입력>>");
		String name = scan.nextLine();
		name_func(name);
		
		System.out.print("출력할 구구단 숫자 입력>>");
		int guguDan = Integer.parseInt(scan.nextLine());
		gu(guguDan);
		/* 2번 문제)스캐너로 입력받은 해당 숫자 구구단을 구해서 출력하는 정적메서드 static void gu(int k){} 를 정의한다.
		 * 구구단 구하는 부분은 for반복문을 활용한다.
		 */
	}
}
