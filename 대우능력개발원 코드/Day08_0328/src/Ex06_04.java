/* 06.반복문.pdf No.21쪽 4번문제 풀이 
 */
public class Ex06_04 {
	public static void main(String[] args) {
    /* 문제)A부터 Z사이의 영문대문자 알파벳 출력하는 프로그램을 작성. 단, for반복문을 사용해야 하고 하나는 int 타입을 사용하고, 또다른
     * 하나는 char 타입을 사용해야 한다. 증감연산자 (++,--)는 자동산술법(자료손실 위험이 없는 더 큰타입으로 자동형변환을 하는 것을
     * 말한다.)을 적용 안한다.
     */
	 //답안코드 시작
	 
	 //int 타입
	 for(int i='A';i<='Z';i++) {
		 System.out.print(" "+(char)i);
	 }
	 
	 System.out.println("\n ===========================> \n");
	 
	 //char 타입 => 권장 코드
	 for(char i='A';i<='Z';i++) {
		 System.out.print(" "+i);
	 }
	}
}
