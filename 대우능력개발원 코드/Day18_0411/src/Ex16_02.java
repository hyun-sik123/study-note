/* 16장.상속.pdf의 No.20 1번문제) 
 */
class Parent02{//extends Object 이 생략됨.
	private int a;
	        int b;
    protected int c;
    public int d;
}

class Child02 extends Parent02{
	
	public Child02(int a,int b,int c,int d) {
		this.a=a; //[1] 정답: 부모의 Parent02에서 private으로 정의된 멤버변수 a는 자손에서 못가져온다.
		this.b=b; //[2]
		this.c=c; //[3]
		this.d=d; //[4]
	}//생성자 오버로딩
	
	void func() {
		System.out.println(a); //[5] 정답
		System.out.println(b); //[6]
		System.out.println(c); //[7]
		System.out.println(d); //[8]
	}
}
public class Ex16_02 {
	public static void main(String[] args) {
       Child02 one = new Child02(1,2,3,4);
       one.func();
	}
}
