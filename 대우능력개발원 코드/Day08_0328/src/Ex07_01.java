public class Ex07_01 {
	public static void main(String[] args) {
/* 07장.제어문의 다양한 활용.pdf No.8 1번 문제)
 * 문제)22부터 76까지의 짝수의 개수와 그 합을 구하는 프로그램을 작성.(일반 for문) 
 * 힌트는 짝수의 개수를 구할때는 ++ 증가 연산자를 활용한다.
 *  단, 2씩 증가된 for반복문과 1씩 증가된  for 반복문 각각 사용한다. 특히 1씩 증가된 반복문 안에서는 if문과 나머지 연산 %를 사용해야
 *  한다.
 */
		int i;//반복문 제어변수
		int count = 0;//짝수들의 개수를 저장할 변수
		int sum= 0;//짝수들의 누적합을 저장할 변수
		
		//2씩 증가
		for(i=22;i<=76;i+=2) {
			count++;//짝수들의 개수를 카운터
			sum+=i;
		}
		
		System.out.printf("짝수들의 개수=%d \n", count);
		System.out.println("짝수들의 누적합="+ sum);
		
		System.out.println("\n ==================> \n");
		
		int j, cnt, total;//반복문 제어변수, 짝수들의 개수, 짝수들의 누적합
		
		//1씩 증가
		for(j=22, cnt=0, total=0;j<=76;j++) {
			if(j % 2 == 0) {//나머지가 2일때 실행=>짝수들일때 실행
				cnt++;//짝수들의 개수를 카운터
				total = total + j;//짝수들의 누적합
			}//if
		}//for
		
		System.out.println("짝수들의 개수="+cnt+", 짝수들의 누적합="+total);
	}
}
