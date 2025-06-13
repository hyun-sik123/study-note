/* 06.반복문.pdf No.20쪽 3번문제 풀이 
 */
public class Ex06_03 {
	public static void main(String[] args) {
     /* 문제) 10부터 1사이의 짝수를 10,8,6,4,2로 출력하는 프로그램 작성(주의사항은 2출력하고 ,가 출력 안 되어야 한다.)
      * 힌트)for 반복문을 사용하지 않고 while 반복문을 사용해야 한다. 
      */
	  //답안 코드 시작
	  int i=10;//반복문 제어변수
	  while(i>=4) {
		  System.out.print(i+",");//10,8,6,4,
		  i-=2;//2씩 감소
	  }
	  System.out.print(i);//2
	}
}
