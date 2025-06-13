/* 자바 인터페이스.pdf 24쪽 1번문제)
 *  1.net.daum.model01  패키지에 부모 인터페이스 IShapeClass.java 를 정의하고 추상메서드 void draw();를 정의한다.
 *  2.net.daum.model02  패키지에 부모 인터페이스를 상속받은 자손클래스 Circ.java,Rect.java,Tria.java 를 만들고
 *  추상메서드 draw()를 오버라이딩을 한다음 실행문장으로 "타원을 그린다.", "사각형을 그린다.", "삼각형을 그린다"로 한다. 
 *  그런다음 다음과 같은 출력 결과물이 나오게 만든다.
 *  
 *  출력결과물)
 *  타원을 그린다.
 *  사각형을 그린다.
 *  삼각형을 그린다.
 */

import net.daum.model01.IShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

public class Ex19_01 {
	public static void main(String[] args) {

		IShapeClass ref;//인터페이스로 참조변수 선언 가능함
		
		ref = new Circ();//업캐스팅
		ref.draw();//업캐스팅 이후 오버라이딩 한 메서드 호출
		
		ref = new Rect();
		ref.draw();
		
		ref = new Tria();
		ref.draw();
		
		System.out.println("\n ===================== \n");
		
		pr(new Circ()); pr(new Rect()); pr(new Tria());
	}//main()
	
	static void pr(IShapeClass ish) {//매개변수 다형성
		ish.draw();
	}
}







