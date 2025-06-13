/* 17장.레퍼런스 형 변환.pdf 의 No.19의 2번 문제)
 *  명시적인 다운캐스팅을 할 때 if조건문과 형변환 유무 판단연산자를 추가 코딩해서 활용하자.
 */
class SubClass {//extends Object
	int i = 3;
	
	void pr() {
		System.out.println("i="+i);
		System.out.println("this.i="+this.i);
	}
}
public class Ex17_01 {
	public static void main(String[] args) {
      Object obj = new SubClass();//업캐스팅
      
      if (obj instanceof SubClass) {//다운캐스팅이 가능한가? 참
    	  SubClass foo = (SubClass)obj;//명시적인 다운캐스팅
    	  foo.pr();
      }
	}
}
