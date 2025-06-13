/* 다운캐스팅을 할때는 사전에 반드시 업캐스팅을 해야 하지만 이것을 하지 않고 명시적인 형변환연산자를 사용해서 다운캐스팅을 하면 자바컴파일러는
 * 이 부분을 검증하지 못해서 정상적인 컴파일은 해서 바이트 코드 클래스 파일을 만든다. 그런 다음 이 클래스파일을 실행시 예외 오류를 던진다.
 * 이 부분을 방지하기 위해서 나온 것이 바로 형변환 유무 판단 연산자인 instanceof 이다.
 * 결국 캐스팅 연산 예외 오류가 나는 소스이다.
 */
class Mother03{
	void m03() {
		System.out.println("부모 타입 m03()");
	}
}
class Child03 extends Mother03{
	void ch03() {
		System.out.println("자손타입 ch03()");
	}
}
public class RefCast03 {
	public static void main(String[] args) {

		Mother03 m=new Mother03();// 사전에 업캐스팅을 안함.
		Child03 ch=(Child03)m;// 명시적인 다운캐스팅
		// 사전에 업캐스팅을 하지 않아서 캐스팅 연산 예외 오류를 던진다.
		ch.m03();
		ch.ch03();
	}
}
