/* switch~case에서 case 레이블 작성순서)
 *  레이블이 패턴인 경우 좁은 범위의 패턴을 먼저 기술하고, 넓은 범위 패턴을 나중에 기술한다. 부모 자식 관계나 부모 인터페이스를 구현한 자손 
 *  클래스 인 경우 부모는 자손보다 더 넓은 범위를 가진다. 그러므로 자손을 먼저 기술하고 부모 클래스나 인터페이스는 나중에 기술한다. 
 */
public class GuardEx03 {
	private static void method01(Integer obj) {//오토박싱, 업캐스팅은 적용 안됨.
		switch(obj) {
		 case 0 -> System.out.println(0);//자바 5 에서 추가된 오토언박싱(참조 레퍼 Integer 타입이 기본 int타입으로 자동형변환)
		 case Integer i when i > 0 -> System.out.println("양수이다.");//레이블이 패턴을 사용한 경우 좁은 범위의 패턴을 
		 //먼저 기술하고, 넓은 범위의 패턴을 나중에 기술한다.
		 case Integer i -> System.out.println("음수이다.");
		}
	}//method01()
	
	private static class A{//extends Object 가 생략됨. 즉 최고 조상 Object 클래스로 부터 확장 상속(extends)
		//정적 부모클래스 A		
	}
	
    private static class B extends A{
    	// 범위가 좁은 자손클래스  B
    }
    
    private static void method02(Object obj) {//업캐스팅
    	switch(obj) {
    	case B b -> System.out.println("obj is B type");//레이블 패턴이 사용되면 부모가 자손보다 항상 더 넓은 범위를 가진다.
   	    //그러므로 좁은 범위의 자손 B를 먼저 기술
    	case A a -> System.out.println("obj is A type");
    	case Object o -> System.out.println("obj is Object type");
    	//case null, default -> System.out.println("obj is null or unknown type");
    	}
    }//method02()
	public static void main(String[] args) {
     method01(10); method01(-10); method02(new A()); method02(new Object());
	}
}
