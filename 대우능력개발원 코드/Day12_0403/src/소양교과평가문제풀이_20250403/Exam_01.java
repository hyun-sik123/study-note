package 소양교과평가문제풀이_20250403;

public class Exam_01 {
/* java의 for반복문을 이용해서 다음과 같은 출력 결과물이 나오는 코드를 완성하시오. 
 * 출력예)  * * *
 *        * * *
 *        * * * 
 */
	public static void main(String[] args) {

		//답안코드 작성
		int i,j;//반복문 제어변수
		for(i=1;i<=3;i++) {//이중 for반복문
			for(j=1;j<=3;j++) {
				System.out.print(" *");
			}//inner for
			System.out.println();//줄바꿈=>개행
		}//outer for
	}
}
