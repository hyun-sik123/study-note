/* 16장.상속.pdf의 No.28 5번문제) 
 *  컴파일 에러가 발생한다. 에러 이유에 대해서 주석문 처리한다.
 */

class TestSuper{//extends Object
	int i;
	
	TestSuper(int i){
		this.i=i;
	}//생성자가 오버로딩이 되면 전달인자가 없는 기본생성자는 묵시적 제공을 하지 않는다.
}

class TestSub extends TestSuper{
	/* 컴파일 에러가 나는 이유는 부모 TestSuper 클래스가 생성자 오버로딩이 되어서 기본생성자를 묵시적 제공하지 않는다. 그런대 자손에서
	 * 부모의 기본생성자를 호출할려니 에러가 발생하는 것이다.
	 */
	//기본생성자 묵시적 제공
}

public class Ex16_06 {
	public static void main(String[] args) {
      new TestSub();//자손 기본생성자를 호출		
	}
}
