//부모와 동일 멤버변수가 자손에서 정의 안된 경우나 자손에서 메서드가 오버라이딩을 안한 경우는 호출되는 변수나 메서드에 대해서 고민할 필요가
//없다.
class Mother09{
	int x=100;
	
	void method() {
		System.out.println("부모클래스 메서드()");
	}
}

class Child09 extends Mother09{
	
}

public class RefCast09 {
	public static void main(String[] args) {

		Mother09 m09=new Child09();//업캐스팅
		System.out.println("m09.x="+m09.x);
		m09.method();
		
		Child09 ch09=new Child09();
		System.out.println("ch09.x="+ch09.x);//상속받아서 호출
		ch09.method();//상속받아서 호출
	}
}
