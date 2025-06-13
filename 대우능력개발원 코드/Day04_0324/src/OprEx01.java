/* 확장된 대입(복합대입) 연산자 종류)
 *  a+=10은 a=a+10을 의미한다.
 *  a-=2는 a=a-2를 뜻한다.
 */
public class OprEx01 {
	public static void main(String[] args) {

		int i=1;
		i = i+5;
		System.out.printf("%d \n", i);//%d는 십진수 출력형태, \n은 줄바꿈(개행)
		
		i-=3; //i=i-3;과 같다.
		System.out.println("i="+i);
		
		i+=7;//i=i+7; 과 같다.
		System.out.printf("i=%d %n",i);//10, %n은 줄바꿈
	}
}
