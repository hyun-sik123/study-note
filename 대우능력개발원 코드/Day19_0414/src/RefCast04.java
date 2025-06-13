/* 정상적인 업캐스팅과 다운캐스팅이 되는 예제) 
 */
class Mother04{
	void m04() {
		System.out.println("부모클래스 메서드 m04()");
	}
}
class Child04 extends Mother04{
	void ch04() {
		System.out.println("자손클래스 메서드 ch04()");
	}
}
public class RefCast04 {
	public static void main(String[] args) {
       Mother04 m = new Child04();//사전에 업캐스팅을 함
       Child04 ch=(Child04)m;//명시적인 다운캐스팅
       ch.m04();//상속받아서 호출
       ch.ch04();//자손에서 정의한 메서드 호출
	}
}
