/* 상속관계에서 업캐스팅 이후 오버라이딩 한 메서드 호출에 관한 문제) 
 */
class Super extends Object{//extends Object은 생략가능함.
	public int getNumber(int a) {
		return a+1;
	}
}

class CastingEx03 extends Super{

	@Override
	public int getNumber(int a) {//메서드 오버라이딩
		return a+2;
	}	
}

public class Ex17_02 {
	public static void main(String[] args) {

		Super a = new CastingEx03();//업캐스팅
		System.out.println(a.getNumber(0));//2=>업캐스팅 이후 오버라이딩 한 메서드 호출
	}
}
