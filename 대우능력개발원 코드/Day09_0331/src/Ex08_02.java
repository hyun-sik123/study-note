import java.util.Random;

public class Ex08_02 {
	public static void main(String[] args) {
/* 문제) 1부터 50까지의 자연수 중에서 3의 배수만 빼고 누적합을 구해서 출력해 본다. 단,while 반복문을 사용해야 한다. 
 */
		int sum = 0;//누적합
		int i = 0 ;//반복문 제어변수
		
		while(i<=50) {
			i++;//반복 계속 수행
			
			if(i % 3 == 0) {//3의 배수일때 실행
				continue;
			}//if
			sum += i;//3의 배수일때만 누적합을 안 구함
		}//while
		
		System.out.printf("3의 배수만 빼고 누적합=%d\n", sum);
		
		//for 무한루프문을 사용해서 주사위 눈의 수를 구함
		for(;;) {
			Random r=new Random();//난수를 발생시키는 내장 API클래스
			int diceFaceNumber = r.nextInt(6)+1;//nextInt(6) 내장메서드는 0이상 6미만 사이의 정수 숫자 난수를 발생->
			//+1을 하면 1이상 7미만 즉 1부터 6사이 정수 숫자난수가 발생->임의의 주사위 눈 수
			System.out.println("임의의 주사위 눈 수="+diceFaceNumber);
			
			if(diceFaceNumber == 4) break;//무한루프문 종료
		}
	}
}
