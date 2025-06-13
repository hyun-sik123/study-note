package 소양교과평가문제풀이_20250403;

public class Exam_02 {
/*
 * java의 for반복문을 이용해서 다음과 같은 출력 결과물이 나오는 코드를 완성하시오. 
 * 출력예)  *
 *        * *
 *        * * * 
 */
	public static void main(String[] args) {

		//답안코드 작성
		int i;//바깥for반복문 제어변수
		int j;//안쪽 for 반복문 제어변수
		
		for(i=1;i<=3;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
