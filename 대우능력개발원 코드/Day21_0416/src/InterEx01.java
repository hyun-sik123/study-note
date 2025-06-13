/* 1. 부모 인터페이스에 추가된 추상메서드는 반드시 이를 구현 상속한 자손클래스에서 오버라이딩을 해야 한다. 그러면 자손클래스에서 불필요한 
 * 추상메서드까지 오버라이딩을 해야하는 불편함을 해결하기 위해서 추가된 자바 8버전에서 사용하는 것이 디폴트 메서드이다.
 */
interface ParentInter01{
	void absmethod();//public abstract가 생략된 추상메서드
	
	public default void defaultMethod() {//public 접근권한 제어자는 생략가능=>디폴트 메서드 정의
		System.out.println("부모 인터페이스의 디폴트 메서드");
	}
}

class ChildClass01 implements ParentInter01{

	@Override
	public void absmethod() {
		System.out.println("부모인터페이스의 추상메서드가 오버라이딩 된것임.");
	}

	//선택적으로 필요하면 디폴트 메서드 오버라이딩하고 불필요하면 안해도 된다.
	@Override
	public void defaultMethod() {
		System.out.println("부모인터페이스의 디폴트 메서드는 선택적으로 오버라이딩한다.");
	}
}

public class InterEx01 {
	public static void main(String[] args) {
         ChildClass01 child=new ChildClass01();
         child.absmethod();
         child.defaultMethod();
	}
}
