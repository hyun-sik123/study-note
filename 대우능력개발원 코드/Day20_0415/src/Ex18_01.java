/* 18장.추상 클래스와 final.pdf No19 1번 문제) 
 * 부모 추상클래스의 추상메서드는 상속받은 자손클래스에서 모두 오버라이딩을 해야 한다.
 */
abstract class Abs01{
	int a=10;
	String str="Test";
	
	public abstract int getA();//추상 메서드
	
	public String getStr() {
		return str;
	}
}

abstract class Abs02 extends Abs01{
	int b = 100;
	
	public abstract int getB();
}

class AbsMain extends Abs02{

	@Override
	public int getB() {
		return b;
	}

	@Override
	public int getA() {
		return a;
	}
	
}
public class Ex18_01 {
	public static void main(String[] args) {

		AbsMain am=new AbsMain();
		System.out.println(am.getA());
		System.out.println(am.getB());
	}
}
