//비트 단위 쉬프트(shift:비트 왼쪽/오른쪽 이동) 연산자
public class OprEx04 {
	public static void main(String[] args) {

		byte x = 15;
		
		System.out.println("x << 2 : "+ (x << 2));//15 << 2 는 정수 15를 2비트 만큼 왼쪽으로 이동시키고 오른쪽 빈자리는 비트
		//는 항상 0으로 채운다. 60
		System.out.println(" x >> 2 : "+ (x >> 2));//3
	}
}
