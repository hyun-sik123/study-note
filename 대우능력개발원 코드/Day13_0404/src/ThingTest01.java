/* 11장.클래스와 객체.pdf No.13의 1번문제)
 * 다음은 하나의 속성(변수 x)을 갖는 Thing 클래스입니다. 다음 예제에서 문제점을 발견하고 이를 수정해 봅시다
class Thing{
  private int x;
} 
public class ThingTest01 {
public static void main(String[] args) { 
 Thing thing1; 
 thing1=new Thing(); 
 thing1.x=10; 
 System.out.println(thing1.x);
} 
}
 */
class Thing{
	private int x;//x속성은 private접근 권한 제어자로 선언되어 있어서 Thing클래스 외부에서 접근 못함.
	
	public void setX(int new_x) {//값 저장 setter()메서드 정의
		 x=new_x;
	}
	public int getX() {//값반환 getter()메서드 정의
		return x;
	}
}
public class ThingTest01 {
	public static void main(String[] args) {

		Thing thing01;
		thing01 = new Thing();
		//thing01.x=10;
		thing01.setX(10);
		System.out.println("값 반환="+thing01.getX());
	}
}
