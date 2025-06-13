/* 11장.클래스와 객체.pdf No.14의 2번문제) */

class Product{
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String new_name) {
		name = new_name;
	}
	
	public void setPrice(int new_price) {
		price = new_price;
	}
	
	void stop() {//return  종료 기능
		for(int i=1;i<=10;i++) {
			if(i == 4) {
				return;//종료
			}//if
			System.out.print("\t"+i);// 1 2 3
		}//for
	}//stop()
}

public class Ex11_02 {
	public static void main(String[] args) {
       Product p=new Product();
       p.setName("커피"); p.setPrice(150);
       System.out.println("출력: 자판기 => 제품목록");
       System.out.println(p.getName()+" "+p.getPrice()+"원");
       
       p.setName("비타500"); p.setPrice(500);
       System.out.printf("%s %d원\n", p.getName(),p.getPrice());
       
       p.stop();
	}
}
