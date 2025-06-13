/* 16장.상속.pdf의 No.31 8번문제) 
 *  컴파일 에러가 발생한다. 에러 이유에 대해서 주석문 처리한다.
 */
class A{//extends Object
	public A() {
		super();//최고 조상 Object기본생성자를 호출=>super();생략 가능
		System.out.println("A클래스 기본생성자");
	}
}

class B extends A{
	public B() {
		System.out.println("B 자손클래스 기본생성자");
		super();
		/* 컴파일 에러가 발생하는 이유는 부모클래스 기본생성자를 먼저 호출할려면 super(); 은 첫줄에 코드해야 한다. 그러지 못해서
		 * 발생하는 에러이다.
		 */
	}
}

public class Ex16_09 {
	public static void main(String[] args) {
        new B();//자손클래스 B() 기본생성자를 호출
	}
}
