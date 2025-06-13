/* 자바 OOP에서 클래스 소속의 사용자 정의메서드)
 * return키워드로 값을 반환하는 메서드와 그렇지 않고 구구단을 출력하는 메서드
 */
class Obj07{
	void print99Dan() {
		int i,j;//반복문 제어변수이고 지역변수
		for(j=1;j<=9;j++) {
			for(i=2;i<=9;i++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();//개행(줄바꿈)
		}
		System.out.println("\n =================== \n");
	}//구구단 출력 메서드
	
	int add(int a,int b) {
		return a+b;//return 키워드에 의해서 해당 메서드를 호출한 곳으로 덧셈 결과값을 반환한다.
	}//덧셈 연산해서 결과값을 반환
}

public class ObjectEx08 {
	public static void main(String[] args) {

		Obj07 obj=new Obj07();
		obj.print99Dan();
		System.out.println("10+10="+obj.add(10, 10));
	}
}
