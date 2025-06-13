/* 자바 21버전에서 새롭게 추가된 가드 사용)
 *  switch~case문에서 레이블 패턴과 함께 좀더 상세한 조건을 만들기 위해서 when으로 시작하는 가드(guard)를 사용할 수 있다.
 *  when 다음에 패턴 변수를 사용해서 boolean 타입으로 리턴하는 조건식을 걸수 있다. 리턴값이 true이면 레이블을 선택하고 해당 실행문장을
 *  수행한다.
 */
public class GuardEx01 {
    private static void method01(Object obj) {//업캐스팅
    	int score = switch(obj) {//표현값이 참조타입이어서 레이블 패턴 사용할 수 있다.
    	  case Integer i when i == 1 -> 90;//Integer i가 레이블 패턴,  when i == 1이 레이블 가드
    	  case Integer i when i == 2 -> 80;
    	  case Integer i -> 70;
    	  case String s when s.equals("a") -> 90;//레이블 패턴에서 다운캐스팅
    	  case String s when s.equals("b") -> 80;
    	  case String s -> 70;
    	  case null, default -> 0;
    	};
    	
    	System.out.println("score = "+ score);
    }
	public static void main(String[] args) {
       method01(1);//기본 int 타입이 참조 레퍼타입인 Integer형으로 오토박싱
       method01(2);
       method01(3);
       System.out.println("\n");
       method01("a"); method01("b"); method01("c"); method01(null);
	}
}
