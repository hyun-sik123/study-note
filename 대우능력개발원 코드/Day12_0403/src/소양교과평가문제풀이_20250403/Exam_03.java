package 소양교과평가문제풀이_20250403;

public class Exam_03 {
/* 문제3) for반복문을 이용해서 1부터 10까지의 정수 중에서 4의 배수의 총합을 구하는 java 코드를 
작성해 보세요. 
 */
	public static void main(String[] args) {

		int i;//반복문 제어변수
		int sum = 0;//4의 배수 총합
		
		for(i=1;i<=10;i++) {
			if(i % 4 == 0) {//4의 배수일 때 실행
				sum += i;
			}
		}//for
		System.out.println("1부터 10까지 자연수 중에서 4의 배수 총합="+sum);
	}
}
