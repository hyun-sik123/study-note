/* 16장.상속.pdf의 No.29 6번문제)  
 */
class Base{
	Base(){
		//super(); 생략됨.
		System.out.print("Base");
	}
}

class Alpha extends Base{
	
	//자손 클래스에서 기본생성자 묵시적 제공
	
}
public class Ex16_07 {
	public static void main(String[] args) {
       new Alpha();//자손클래스 기본생성자 호출
       new Base();//부모클래스 기본생성자 호출
       //출력결과물:BaseBase
	}
}
