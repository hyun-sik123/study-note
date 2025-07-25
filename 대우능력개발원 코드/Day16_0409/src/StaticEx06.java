/* 원주율,최대값,최소값을 구하는 것을 내장 API를 사용) 
 */
public class StaticEx06 {
	public static void main(String[] args) {

		int a=40, b=30, c=10;
		
		int result=0;
		result = Math.max(a, b);//a와 b중 더 큰값
		System.out.println(a+"와 "+b+"중 더 큰값(최대값)="+result);
		
		result = Math.min(b,c);//b와 c중 더 작은값
		System.out.printf("%d 와 %d중 더 작은값(최소값) = %d\n", b,c,result);
		
		System.out.println("원주율 값="+Math.PI);
		double area=0.0;//원의 면적(반지름*반지름*원주율)
		int r=5;//반지름
		area = r*r*Math.PI;
		System.out.println("반지름이 "+r+"인 원의 면적="+area);
	}
}
