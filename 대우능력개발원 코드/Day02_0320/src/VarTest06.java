/* printf()메서드와 함께 사용하는 다양한 출력형태 지시자 종류)
 * %b(true or false 인 boolean), %d(십진수 정수), %o(8진수 정수 출력형태), %x or %X(16진수 정수),
 * %f(10진수 실수), %e or %E(지수형태표현),  %c(단일 문자), %s(문자열)
 */
public class VarTest06 {
	public static void main(String[] args) {

		char c='A';//'A'는 십진수 정수 65
		System.out.printf("c=%c,%d %n", c,(int)c);
		
		int octNum = 010;//정수 숫자값 10앞에 접두어 0이 붙은 8진수 정수
		System.out.printf("octNum=%o, %d%n", octNum, octNum);//10, 8
		
		int hexNum = 0x10;//접두어 0x가 붙은 16진수 정수
		System.out.printf("hexNum=%X, %d\n", hexNum,  hexNum);//10, 16
		
		int binNum = 0b10; //접두어 0b가 붙은 2진수 정수(자바7에서 추가)
		System.out.printf("binNum=%s, %d\n", Integer.toBinaryString(binNum), binNum);//"10", 2
		/* 자바에서는 이진수 정수 출력형태 지시자는 존재하지 않는다. 그래서 내장 Integer 래퍼클래스 하위의 정적메서드인 toBinaryStri
		 * ng(int i)메서드를 활용해서 주어진 정수를 이진 문자열로 반환한다.
		 */
	}
}
