/* String 문자열 배열을 다루는 소스) 
 */
public class ObjectArrEx02 {
	public static void main(String[] args) {

		String[] names = {"Kim","Park","Yi"};
		
		//일반 for반복문으로 문자열 배열원소값 출력
		for(int i=0;i<names.length;i++) {
			System.out.println("names["+i+"] : "+ names[i]);
		}
		System.out.println("\n ===================> \n");
		
		//자바 5버전에서 추가된 향상된 확장 for로 배열원소값 출력
		for(String name:names) {
			System.out.print(" "+name);
		}
		System.out.println("\n ==================> \n");
		
		String tmp = names[2];
		System.out.printf("tmp=%s\n", tmp);
		
		names[0]="Yang";//첫번째 원소값 변경
		
		//향상된 확장 for로 names 배열원소값 출력
		for(String editName:names) {
			System.out.println(editName);
		}
	}
}
