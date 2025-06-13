/* 특정은행 Atm계좌에서 출금,입금과 같은 특정한 작업이 이루어질때 한번에 하나의 스레드에 의해서만 입/출금 작업이 이루어 지도록 
 * synchronized 키워드로 동기화 즉 임계영역을 만든다.
 */
class Atm{//Atm 계좌
	private int money;//은행 계좌 잔액
	
	public Atm(int money) {
		this.money=money;//계좌 개설시 입금할 금액
	}
	
	//입금 동기화 처리
	synchronized void deposit(int amount,String name) {
		money += amount;
		System.out.println(name+" 입금금액 =  "+amount);
	}
	
	//출금 동기화 처리
	synchronized void withdraw(int amount, String name) {
		if((money - amount) > 0){//출금 가능하면
			money -= amount;//잔액-출금금액
			System.out.println(name+" 출금금액 = "+ amount);
		}else {
			System.out.println(name+" 잔액부족으로 출금못함");
		}
	}
	
	public void getMoney() {
		System.out.println("계좌 잔액="+money);
	}
}//Atm class

class AtmUser extends Thread{
	boolean flag=false; //입금/출금 분기
	Atm obj;
	
	public AtmUser(Atm obj,String name) {//생성자 오버로딩
		super(name);//부모클래스 오버로딩 된 생성자를 호출해서 스레드 이름을 반환
		this.obj=obj;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				sleep(500);
			}catch(InterruptedException ie) {}
			
			if(flag) {//==true가 생략됨
				obj.deposit((int)(Math.random()*10+2)*100, getName());
				obj.getMoney();
			}else {
				obj.withdraw((int)(Math.random()*10+2)*100, getName());//random()정적메서드는 0.0이상 1.0미만 사이의
				//실수 숫자 난수가 발생=>*10하면 0.0이상 10.0미만 사이 실수숫자 난수 발생=>+2하면 2.0이상 12.0미만=>(int)로 형
				//변환 하면 소수점이하는 버리고 2이상 11(12미만)=>*100하면 200이상 1100(1200미만)
				//getName()메서드는 스레드 이름 반환
				obj.getMoney();//잔액조회
			}//if else
			flag=!flag;
		}//for
	}//쓰레드 문장 구현
}//AtmUser class
public class ThreadEx05 {
	public static void main(String[] args) {
      Atm obj = new Atm(1000);//계좌 개설하면서 1000원 입금
      AtmUser user01=new AtmUser(obj,"홍길동");
      AtmUser user02=new AtmUser(obj,"이순신");
      AtmUser user03=new AtmUser(obj,"강감찬");
      
      user01.start();//스레드 시작
      user02.start();
      user03.start();
	}
}
