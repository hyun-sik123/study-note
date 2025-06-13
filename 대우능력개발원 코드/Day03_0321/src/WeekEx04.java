/* 자바의 비교(관계) 연산자 종류)
 *  1.비교 연산자의 결과값은 boolean 타입이다. 즉 true or false이다.
 *  2.비교 연산자 종류)
 *    >(~보다 크다), >=(~보다 크거나 같다), <(~보다 작다), <=(~보다 작거나 같다), ==(같다), !=(같지 않다)
 */
public class WeekEx04 {
	public static void main(String[] args) {

		boolean result=false;
		result = (6>2);
		System.out.println("6>2 :"+ result);//true
		
		result = (2 >= 5);
		System.out.println("2 >= 5 : "+ result);//false
		
		result = (2<3);
		System.out.println("2<3 : "+ result);//true
		
		result = (8 <= 2);
		System.out.println("8 <= 2 : "+ result); //false
		
		result = (8 == 2);
		System.out.println(" 8 == 2 : "+ result);//false
		
		result = (8 != 2);
		System.out.println(" 8 != 2 : "+ result); //true
		
		System.out.println("\n ======================> \n");
		
		int a=10, b=4;
		result = (a+b) > (a-b);//14>6
		System.out.println((a+b) + ">"+(a-b)+" : "+ result);//true
		
		result = a < b;
		System.out.printf("%d < %d : %b\n", a, b, result);
		//%b는 boolean 타입 출력 형태이다.
	}
}
