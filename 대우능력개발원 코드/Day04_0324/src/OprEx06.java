//자바의 산술 연산자
public class OprEx06 {
	public static void main(String[] args) {

		int a=10;
		int b=4;
		
		System.out.printf("%d + %d = %d \n",a,b,a+b);
		
		int result = a-b;
		System.out.println(a +" - "+ b +" = "+result);
		
		System.out.printf("%d * %d = %d \n", a,b,a*b);
		System.out.printf("%d / %d = %d \n", a,b,a/b);//정수 숫자를 나눗셈하면 몫만 구하고, 실수 숫자를 나눗셈하면 몫과 나머지
		//를 함께 구한다.
		
		/* 문제) int 타입 b변수값을 float 타입으로 형변환 해서 나눗셈 한 결과값을 소수점 이하 6자리까지 printf()메서드를 사용해서
		 * 출력해 보자.
		 */
		//답안 코드
		System.out.printf("%d / %f = %f \n", a, (float)b, a/(float)b);
	}
}
