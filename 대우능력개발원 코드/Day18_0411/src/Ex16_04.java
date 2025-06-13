/* 16장.상속.pdf의 No.23 3번문제) 
 */
class Animal{
	protected String kind;//동물 종을 저장할 변수
	protected int leg;//다리 개수
	
	public Animal() {}
	
	public Animal(String kind, int leg) {
		this.kind=kind;
		this.leg=leg;
	}
	
	public void getKind() {
		if(kind.equals("소녀")) {
			System.out.println(kind+"는 사람이다.");
		}else {
			System.out.println(kind+"는 동물이다.");
		}
	}
	
	public void walk() {
		if(leg == 2) {
			System.out.println("사람은 "+leg+"발로 걷는다.");
		}else {
		    System.out.println("동물은 "+leg+"발로 걷는다.");
		}//if else	
	}//walk()
}

class Human extends Animal{
	public Human() {}
	
	public Human(String kind,int leg) {
		super(kind,leg);//부모클래스 오버로딩 된 생성자를 호출
	}
}//Human 자손클래스

class Dog extends Animal{
	public Dog() {}
	
	public Dog(String kind, int leg) {
		super(kind,leg);
	}
}

public class Ex16_04 {
	public static void main(String[] args) {
        Dog d=new Dog("강아지",4);
        Human h=new Human("소녀",2);
        
        d.getKind();
        d.walk();
        h.getKind();
        h.walk();
	}
}
