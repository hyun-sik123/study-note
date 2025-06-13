/* 일반 클래스나 추상클래스는 하나 이상의 부모로 부터 다중 상속을 받을 수 없고, 단일 상속만 가능하다. 
 */
abstract class Hello08{//extends Object
	public abstract void sayHello(String name);//추상클래스에서 추상메서드를 정의할 때는 abstract 키워드 생략못함
}
abstract class GoodBye08{
	public abstract void sayGoodBye(String name);
}
class SubClass08 extends GoodBye08, Hello08{//추상클래스는 단일 상속만 가능하다.
	@Override
	public void sayGoodBye(String name) {
		
	}
	@Override
	public void sayHello(String name) {
		
	}
}

public class AbsEx08 {
	public static void main(String[] args) {

	}
}

