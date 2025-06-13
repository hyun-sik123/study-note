/* 16장.상속.pdf의 No.21 2번문제) 
 */
class Father03{
	protected int a,b,c;
	
	public Father03() {
		//super(); 가 생략됨. 최고 조상 Object클래스 기본생성자를 호출하면서 생성자 호출은 끝이 난다.
		System.out.println("Parent03 클래스의 디폴트 생성자 호출");
	}
	
	public Father03(int a,int b,int c) {
		System.out.println("Father03 클래스의 전달인자 3개짜리 생성자호출");
		this.a=a; this.b=b; this.c=c;
	}
}

class Child03 extends Father03{
	protected int d;
	
	public Child03() {
		//super();//부모클래스 기본생성자를 호출
		System.out.println("Child03 자손클래스 기본생성자~");
	}
	
	public Child03(int a,int b,int c,int d) {
		super(a,b,c);//부모클래스 오버로딩 된 생성자 호출
		this.d=d;
	}
	
	public void print() {
		System.out.println("a="+a+",b="+b+",c="+c+",d="+d);
	}
}

public class Ex16_03 {
	public static void main(String[] args) {
        Child03 ch01=new Child03();
        ch01.print();
        Child03 ch02=new Child03(100,200,300,400);
        ch02.print();
	}
}



