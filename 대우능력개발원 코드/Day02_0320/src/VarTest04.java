//변수 선언과 변수값 바꾸기
public class VarTest04 {
	public static void main(String[] args) {

		int year = 2025;
		var age = 25;		
		
		System.out.printf("년도=%d %n", year);//%n은 플랫폼에 맞는 줄바꿈 기능을 삽입
		System.out.printf("나이:%d \n", age);
		
		year = age + 2000;//숫자(int)+숫자(int) , 여기서 +는 덧셈연산기호
		age = age +1;
		System.out.println("년도 : "+year+", 나이 : "+age);
		
		System.out.println("\n ================> \n");//\n은 줄바꿈
		
		int x=10;
		int y=20;
		int tmp=0;
		
		System.out.println("x="+x+",y="+y);
		
		tmp=x;
		x=y;//10이 20으로 변경
		y=tmp;//20이 10으로 변경, 결국 tmp변수를 활용해서 x,y변수값 변경
		
		System.out.println("x="+x+",y="+y);//20,10
	}
}
