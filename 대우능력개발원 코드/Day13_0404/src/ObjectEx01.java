/* 클래스와 객체 지향에 관한 소스=>객체 지향 프로그래밍(OOP) 
 */
class Animal01{//Animal01 class
	String name;
	int age;//클래스 소속의 속성 2개인 name, age정의, 이것을 클래스 소속의 멤버변수 중 객체 생성해서 접근하는 인스턴스 변수라고 한다.	
}
class Thing01{
	int x;
}
public class ObjectEx01 {
	public static void main(String[] args) {

		Animal01 a;//객체주소가 저장 안된 참조변수
		a=new Animal01();//new키워드로 객체를 생성하면 객체주소가 저장된 참조변수 a =>객체명
		
		a.name = "홍길동";//객체명.속성
		a.age = 26;
		
		System.out.println("이름:"+a.name+", 나이:"+a.age);
		
		/* 11장.클래스와 객체.pdf No.10의 1번문제)
		 * b 객체를 하나 더 생성하여 b로 접근하도록 하고 이름은 "펭귄" 나이는 12를 저장한 후 출력하시오.
		 */
		Animal01 b = new Animal01();//b객체 생성
		b.name = "펭귄";
		b.age = 12;
		System.out.println("이름:"+b.name+",나이:"+b.age);
		
		/*11장.클래스와 객체.pdf No.10의 2번문제)
		 * 하나의 속성(int형 변수 x)을 갖는 Thing 클래스 설계한 후, 객체 thing을 생성한 후 속성 x 에 값 10을 지정한 후,
속성 x의 값을 출력해 봅시다.
		 */
		Thing01 thing;//객체 주소가 저장 안된 참조변수
		thing = new Thing01();//객체주소가 저장된 참조변수=>객체명 thing을 생성
		thing.x=10;
		System.out.println("thing.x=" + thing.x);
	}
}






