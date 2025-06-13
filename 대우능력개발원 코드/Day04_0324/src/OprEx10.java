/* char 타입 단일문자 연산 */
public class OprEx10 {
	public static void main(String[] args) {

		char c01='a';//'a'는 십진수 정수 97
		char c02=c01;
		char c03=' ';
		
		int i = c01+1;//97+1=98
		System.out.printf("i=%d\n", i);//98
		
		c03=(char)(c01+1);//97+1은 char타입이 자동산술법에 의해서 int형으로 자동형변환이 된다. int+int=int이다. 이것을 2바이트
		//크기  char타입 변수 c03에 저장하기 위해서 명시적인 형변환을 한다.
		System.out.printf("c03=%c \n", c03);//b
		
		c02++;
		c02++;//후행 1증가, 증감 연산자는 자동형 변환을 하지 않는다.
		System.out.printf("c02=%c \n", c02);//c
	}
}
