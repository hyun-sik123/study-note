public class Ex07_02 {
	public static void main(String[] args) {
/* 07장.제어문의 다양한 활용.pdf No.8 2번 문제)
 * 문제)1부터 100사이의 합을 구하되 10 단위마다 한 번씩 출력
하시오. (Ex07_02 .java -> for,if,%(나머지연산))
1 ~ 10 까지의 합 -> 55 
1 ~ 20 까지의 합 -> 210 
1 ~ 30 까지의 합 -> 465 
1 ~ 40 까지의 합 -> 820 
1 ~ 50 까지의 합 -> 1275 
1 ~ 60 까지의 합 -> 1830 
1 ~ 70 까지의 합 -> 2485 
1 ~ 80 까지의 합 -> 3240 
1 ~ 90 까지의 합 -> 4095 
1 ~ 100 까지의 합 -> 5050
 */
	 int sum=0;//누적합
	 int i;//반복문 제어변수
	 for(i=1;i<=100;i++) {
		 sum += i;
		 
		 if(i % 10 == 0) {//10의 배수일때 실행 => 10,20,30,...
			 System.out.printf("1 ~ %d 까지의 합 -> %d \n", i,sum);
		 }//if
	 }//for
	}
}
