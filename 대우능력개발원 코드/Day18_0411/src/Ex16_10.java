/*  16장.상속.pdf의 No.32 9번문제)  
 */
class A2{//extends Object

	@Override
	public String toString() {
		return "4";
	}	
}

class B2 extends A2{

	@Override
	public String toString() {//상속관계에서 메서드 오버라이딩
		return super.toString()+"3";
	}	
}

public class Ex16_10 {
	public static void main(String[] args) {
        A2 a=new A2();
        System.out.println(a);//a.toString() 즉  .toString()메서드가 생략됨 ,"4"
        System.out.println(new A2());//.toString()이 생략 => "4"
        
        B2 b=new B2();
        System.out.println(b.toString()); //"43"
        System.out.println(b);//"43"
        System.out.println(new B2().toString());
        System.out.println(new B2());
	}
}
