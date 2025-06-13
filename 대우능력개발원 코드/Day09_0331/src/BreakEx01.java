public class BreakEx01 {
	/* break문의 특징)
	 *  반복문내에서 break 문을 만나면 해당문을 종료한다.
	 */
	public static void main(String[] args) {

		int i;//반복문 제어변수
		
		//1부터 10까지 반복
		for(i=1;i<=10;i++) {
			System.out.print(" "+i);
		}
		System.out.println("\n==================>\n");
		
		//4의 배수일때 중단
		for(i=1;i<=10;i++) {
			if(i%4 == 0) {//4의 배수일때
				break;//반복문 중단
			}//if
			System.out.print(" "+i);// 1 2 3
		}//for
	}
}
