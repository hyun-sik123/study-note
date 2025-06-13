/* 길이가 10인 배열을 만들고 이 배열에 0~9까지의 임의의 정수 난수로 배열원소값을 초기화 한다. 그리고 이 배열에 저장된 각 숫자가 몇 번 반
 * 복해서 나타나는지를 카운터(세어서) 또 다른 배열 counter에 담은 다음 출력하는 소스이다.
 */
public class ObjectArrEx01 {
	public static void main(String[] args) {
     
		int[] numArr = new int[10];
	    int[] counter = new int[10];
	    
	    //정수 난수로 배열원소값을 초기화 한 다음 바로 출력
	    for(int i=0;i<numArr.length;i++) {
	    	numArr[i] = (int)(Math.random() * 10);//random() 메서드는 0.0이상 1.0미만 사이의 실수숫자 난수를 발생=>*10
	    	//하면 0.0이상 10.0미만=>(int)로 캐스팅하면 반올림하지 않고 소수점이하는 버리고 정수만 구함 => 0이상 10미만 즉 0부터 9
	    	//사이의 정수숫자 난수가 발생하고 이것을 numArr배열원소값으로 저장
	    	System.out.print(" "+numArr[i]);
	    }
	    System.out.println("\n===================>\n");
	    
	    for(int i=0;i<numArr.length;i++) {
	    	counter[numArr[i]]++;	    	
	    }
	    
	    for(int i=0;i<numArr.length;i++) {
	    	System.out.println(i+"의 개수 = "+ counter[i]);
	    }
	}
}
