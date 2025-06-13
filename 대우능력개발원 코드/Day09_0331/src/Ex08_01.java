public class Ex08_01 {
/* 08장.제어문을 보조하는 보조 제어문.pdf No.13 1번문제)
 *  1부터 100사이의 자연수중에서 제일 큰 7의 배수를 구하
는 프로그램을 작성하시오. (Ex08_01.java-> for,if,%등)
 * 단, 100부터 1까지 1씩 감소하면서 반복하지 말고 1부터 100까지 1씩 증가하면서 반복해서 구한다. 
 */
	public static void main(String[] args) {
      int sevenMax = 0;//7의 배수 중 가장 큰값
      int i;
      for(i=1;i<=100;i++) {
    	  if(i % 7 == 0) {//7의 배수일때 실행
    		  sevenMax = i;
    	  }
      }//for
      System.out.printf("7의 배수중 가장큰 값=%d\n", sevenMax);
      
      /* 2번문제)100부터 1까지 1씩 감소하면서 for반복문등을 활용하여 6의 배수중 최대값을 구하는 코드를 만들어 보자. 
       */
      for(i=100;i>=1;i--) {
    	  if(i%6 == 0)
    		  break;
      }
      System.out.println("6의 배수중 최대값="+i);
	}
}
