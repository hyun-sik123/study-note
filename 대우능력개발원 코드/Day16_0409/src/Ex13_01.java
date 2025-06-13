/* 13장.생성자.pdf No.19 1번 문제)
 *   Animal 클래스에 생성자를 추가하시오.(생성자 오버로딩)
 */
class Animal{
	String name;
	int age;
	
	Animal(){}
	
	Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println(name+"은(는) "+age+" 살입니다.");
	}
}

public class Ex13_01 {
	public static void main(String[] args) {
       Animal a01 = new Animal("홍길동",26);//전달인자 2개짜리 오버로딩 된 생성자를 호출
       a01.show();
	}
}
