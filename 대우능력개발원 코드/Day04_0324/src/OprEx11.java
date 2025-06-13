public class OprEx11 {
	public static void main(String[] args) {
    /* 문제) 영문 소문자 'a'를 영문 대문자 'A'로 변환해서 출력하는 프로그램을 만들어 보자. 힌트는 단일문자에 해당하는 십진수 정수
     * 를 잘 활용해야 한다. */
	
		char lowerCase = 'a';
		//답안 코드 시작
		char upperCase = (char)(lowerCase - 32);//'a'는 십진수 정수 97, 'A'는 십진수 정수 65, 97-32=65
		System.out.println("영문소문자 'a'를 대문자로 변경: "+upperCase);
	}
}
