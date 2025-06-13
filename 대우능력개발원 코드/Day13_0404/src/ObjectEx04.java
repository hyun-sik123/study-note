/* new키워드로 새롭게 생성된 객체는 서로 다른 객체주소값을 가진다. 
 */
class Tv04{
	String color;//Tv 색상
	boolean power;//전원상태(on/off)
	int channel;//채널번호
	
	/* 클래스 소속 멤버변수인 속성 기본값)
	 *   멤버변수만 선언하고 명시적 코드로 초기화를 하지 않으면 속성(멤버변수)은 기본값으로 알아서 초기화가 된다. 초기값에 대해서 알아본다.
	 *   int 타입 속성은 0으로 초기화
	 *   boolean 타입 멤버변수는 false 기본값으로 초기화
	 *   String등 참조타입변수를 선언만 하고 명시적인 코드로 초기화 하지 않으면 null기본값으로 초기화가 된다.
	 *   double 실수타입 속성은 0.0 기본값으로 초기화
	 */
	
	//3개의 Tv03클래스 메서드 정의
	void power() {
		power = !power;//!false=>true
	}
	
	void channelUp() {
		++channel;//채널 선행증가
	}
	
	void channelDown() {
		--channel;//채널 선행감소
	}
}

public class ObjectEx04 {
	public static void main(String[] args) {

		Tv04 tv01=new Tv04();
		Tv04 tv02=new Tv04();//tv01과 tv02는 서로 다른 객체주소를 가진다.
		
		System.out.println("tv01.channel="+tv01.channel+", tv02.channel="+tv02.channel);//0,0
		
		tv01.channel=10;
		System.out.println("tv01.channel="+tv01.channel+", tv02.channel="+tv02.channel);//10,0
        //tv01.channel번호는 10 이고 , tv02.channel번호는 0이다. 서로 다른 객체주소값을 가지기 때문에 다른값을 가진다.
	}
}
