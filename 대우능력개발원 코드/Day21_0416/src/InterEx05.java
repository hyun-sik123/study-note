/* 자바 인터페이스.pdf 25쪽 2번문제)
 * 추상클래스에 오는 추상메서드는 {}가 없고, 실행문장이 없고 호출이 불가능하다. 만약에 {}가 오고,실행문장이 있다면 추상메서드가 아닌 
 * 일반 메서드가 되어야 한다.
 */
abstract class Test05{
	abstract void methodA();//추상메서드
	
	abstract void methodB() {//{}가 있는 경우에는  abstract키워드가 없는 일반 메서드가 되어야 한다.
		System.out.println("methodB()");
	}
}
public class InterEx05 {
	public static void main(String[] args) {

	}
}
