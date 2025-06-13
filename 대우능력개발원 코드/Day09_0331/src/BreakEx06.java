public class BreakEx06 {
	public static void main(String[] args) {
/* 문제)for반복문과 continue,if조건문을 사용해서 1부터 100까지 자연수 중에서 4의 배수만 빼고 누적합을 구하는 프로그램을 만들어
 * 보자.
 */
		//답안코드
		int i;//반복문 제어변수
		int sum = 0;//누적합
		
		for(i=1;i<=100;i++) {
			if(i%4 == 0) {
				continue;//아래 문장 실행 안하고 반복문 처음으로 돌아가서 다음 반복 계속한다.
			}
			sum += i;//4의 배수만 빼고 누적합
		}//for
		System.out.printf("4의 배수만 빼고 누적합 = %d\n", sum);
	}
}
