/* 인터페이스는 하나 이상의 부모로부터 다중 상속을 할 수 있다. 
 */
interface IHello09{
	void sayHello(String name);//public abstract가 생략됨
}
interface IGoodBye09{
	public abstract void sayGoodBye(String name);
}
class SubClass09 implements IHello09,IGoodBye09{//두 부모 인터페이스로 부터 다중상속을 받고 있다.

	@Override
	public void sayGoodBye(String name) {
		System.out.println(name+"씨 잘가세요.");
	}

	@Override
	public void sayHello(String name) {
		System.out.println(name+"씨 안녕하세요.");
	}	
}
public class AbsEx09 {
	public static void main(String[] args) {
       SubClass09 sub=new SubClass09();
       sub.sayHello("홍길동");
       sub.sayGoodBye("이순신");
	}
}
