package 소양교과평가문제풀이_20250403;

public class Exam_05 {
    /* 문제 5) while 반복문을 사용하여 1부터 10까지의 누적합을 구하는 자바코드를 작성해 보세요. 
     */
	public static void main(String[] args) {

		//답안 코드
		int i = 1;
		int total = 0; //누적합
		
		while(i<=10) {
			total += i;
			i++;
		}
		System.out.println("while반복문을 사용한 1부터 10까지 누적합 = "+total);
	}
}
