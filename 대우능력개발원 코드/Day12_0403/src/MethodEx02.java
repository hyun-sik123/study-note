/* return 값;
 *  값반환 기능
 */
public class MethodEx02 {
    static int getTotal(int data) {//get접두어 시작하는 메서드는 일반적으로 값을 반환해 준다.
    	int i;//반복문 제어변수
    	int sum = 0;//누적합
    	
    	for(i=1;i<=data;i++) {
    		sum += i;
    	}
    	
    	return sum;//return 키워드에 의해서 getTotal()메서드를 호출한 곳으로 누적합을 반환한다.
    }
    
	public static void main(String[] args) {

		int total = getTotal(10);
		System.out.println("1부터 10 까지 누적합="+total);//55
	}
}
