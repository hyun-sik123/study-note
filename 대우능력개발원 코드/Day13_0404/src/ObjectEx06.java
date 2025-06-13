/* 객체 배열 */
class Tv06{
	String color;//Tv 색상
	boolean power;//전원상태(on/off)
	int channel;//채널번호	
	
	//3개의 Tv03클래스 메서드 정의
	void power() {
		power = !power;//!false=>true
	}
	
	void channelUp() {
		++channel;//채널 선행증가
	}
	
	void channelDown() {
		--channel;//채널 선행감소
	}
}
public class ObjectEx06 {
	public static void main(String[] args) {
      Tv06[] tvArr = new Tv06[3];//배열크기 3인 객체배열 tvArr생성
      
      //Tv06객체를 생성해서 tvArr 객체 배열의 각 요소에 저장
      for(int i=0;i<tvArr.length;i++) {
    	  tvArr[i] = new Tv06();
    	  tvArr[i].channel = i+10;//채널 번호 10,11,12 저장
      }
      
      //채널번호 1증가하고 출력
      for(int i=0;i<tvArr.length;i++) {
    	  tvArr[i].channelUp();//채널번호 1증가
    	  System.out.printf("tvArr["+i+"].channel=%d%n", tvArr[i].channel);//11 12 13
      }
	}
}
