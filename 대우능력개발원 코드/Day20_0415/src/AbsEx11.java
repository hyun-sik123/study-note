/* 인터페이스에서 인터페이스 상속은  extends 키워드를 사용한다. 인터페이스 간 상속은 다중상속이 가능하다. */

interface IHello11{
	void hello(String name);//public abstract 이 생략된 추상메서드
}
interface GoodBye11{
	public abstract void bye(String name);
}
interface ITotal11 extends IHello11, GoodBye11{//두 부모 인터페이스로 부터 다중 상속을 받고 있다.
	void greeting(String name);
}

class SubClass11 implements ITotal11{

	@Override
	public void hello(String name) {
		System.out.println(name+" 안녕~");
	}

	@Override
	public void bye(String name) {
		System.out.println(name+" 잘가~");
	}

	@Override
	public void greeting(String name) {
		System.out.println(name+"방가워요~");
	}	
}
public class AbsEx11 {
	public static void main(String[] args) {
       SubClass11 sub = new SubClass11();
       sub.hello("홍길동");
       sub.bye("이순신");
       sub.greeting("강감찬");
       System.out.println("\n =============== \n");
       
       ITotal11 it11 = new SubClass11();//업캐스팅
       it11.hello("세종대왕");
       it11.bye("신사임당");
       it11.greeting("을지문덕");
	}
}






