/* 13장.생성자.pdf No.20 2번 문제)
 *  Product 클래스에 생성자를 추가하시오.
 */
class Product02{
	String name;
	int price;
	
	Product02(){} //기본 생성자
	
	Product02(String name){
		this(name,800);//같은 클래스 내의 다른 생성자를 호출
	}
	
	Product02(int price){
		this("물", 500);
	}
	
	Product02(String name,int price){
		this.name = name;
		this.price = price;
	}//전달인자 개수가 다른 생성자 오버로딩
	
	void print() {
		System.out.println(name+" , "+price);
	}
}
public class Ex13_02 {
	public static void main(String[] args) {
      Product02 p02=new Product02("커피");
      Product02 p03=new Product02(500);
      Product02 p04=new Product02("웰치스",700);
      
      p04.print();
      p02.print();
      p03.print();
	}
}
