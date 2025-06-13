/* 멀티 쓰레드의 스케줄링 메서드 중 sleep() 과 interrupt()등에 대해서 살펴본다. 이 스케줄링 메서드를 잘 활용해서 catch(){}
 * 블록에서 다시 interrupt()메서드를 호출해서 스레드의 인터럽트 된 상태를 다시  true로 초기화 시키면 카운터가 중단된다.
 */
import javax.swing.JOptionPane;

class Thread08 extends Thread{
	@Override
	public void run() {
		int i=10;
		
		while(i != 0 &&  !isInterrupted()) {
			//isInterrupted() 메서드는 쓰레드의 interrupted 된 상태를 boolean 타입을 반환한다.			
			System.out.println(i--);//1초 간격으로 카운터 다운
			
			try {
			   Thread.sleep(1000);//1초간 일시정지 지연=>1초 간격으로 작동	
			}catch(InterruptedException ie) {
				//interrupt()메서드가 호출되면 InterruptedException 예외 오류가 발생하면서 스레드의 interrupted 상태를
				//다시 false 로 자동 초기화
				interrupt();//interrupt()메서드를 호출하면 스레드의 interrupted 상태를 false 에서 true로 초기화 되어서
				//카운터가 중단
			}//try~catch
		}//while
		System.out.println("카운터가 종료되었습니다.");
	}//run()
}

public class ThreadEx08 {
	public static void main(String[] args) throws Exception{

		Thread08 th=new Thread08();
		th.start();//스레드 시작
		
		String name = JOptionPane.showInputDialog("이름 입력:");
		System.out.println("입력한 이름:"+name);
		th.interrupt();//interrupt()메서드를 호출하면 스레드의 interrupted 상태를 false 에서 true로 초기화
		System.out.println("isInterrupted() boolean타입 상태:"+th.isInterrupted());
	}
}
