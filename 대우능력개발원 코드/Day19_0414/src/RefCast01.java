/* 레퍼런스 간의 형변환 중 업캐스팅 특징)
 *  1. 업캐스팅을 할려면 사전에 상속관계를 만들어야 한다.
 *  2. 업캐스팅이란 자손타입이 부모타입으로 올라가는 현상을 말한다. 업캐스팅은 암묵적인 자동형 변환을 해준다.
 */
class Mother01{//extends Object이 생략됨
	public void m01() {
		System.out.println("부모클래스 메서드 m01()");
	}
}
class Child01 extends Mother01{
	public void ch01() {
		System.out.println("자손클래스 메서드 ch01()");
	}
}
public class RefCast01 {
	public static void main(String[] args) {

		Child01 ch01=new Child01();
		ch01.m01();//상속받아서 호출
		ch01.ch01();//자손에서 정의한 메서드 호출
		Mother01 mo;//부모클래스 참조변수 선언=>객체주소가 저장안된 참조변수
		mo=ch01;//업캐스팅
		mo.m01();
		
		System.out.println("\n ================> \n");
		
		Mother01 m02=new Child01();//업캐스팅
		m02.m01();
	}
}
