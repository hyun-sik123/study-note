package 제3장문제풀이;

//2번 문제풀이 코드
public class DataEx02 {
	public static void main(String[] args) {

		byte var01=128; //A. 컴파일 에러가 나는 이유는  byte 형 최대값 범위를 벗어나서 이다.
		short var02=128; //B
		int var03=28L; //C. 에러가 나는 이유는 int타입 값뒤에는 접미사 L이 붙지 않는다. 접미사 L을 사용할려면 int를 long타입으로
		//변경해야 한다.
		long var04=128L; //D
		float var05=123456.789123; //E. 에러가 나는 이유는 float타입 값뒤에는 접미사 f or F가 붙어야 한다. 또는 float을
		//double 변경하면 에러가 안난다.
		double var06=123456.789123;//F
		
		//정답은 A,C,E
	}
}
