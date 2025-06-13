/* 자바의 실수 숫자 자료형(타입) 종류)
 * float: 크기는 4바이트 이고, 저장되는 정밀도는 7자리이다. 값뒤에 접미사 f or F 가 붙는다. 접미사 생략불가
 * double:크기가 8바이트 이고, 저장되는 정밀도는 15자리이다. 값뒤에 접미사 d or D가 붙는다. 정밀도 때문에 자바의 기본 실수숫자 자료형
 * 되어서 접미사 D or d 생략가능하다.
 */
public class DataType04 {
	public static void main(String[] args) {

		float a = 100.7f;
		double b = 100.7f;
		double c = 100.10;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}
