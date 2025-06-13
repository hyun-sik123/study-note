/* Object 최고 부모클래스의 equals() 메서드를 자손에서 오버라이딩을 해서 활용) 
 */
class Point09 extends Object{
	int x,y;
	
	public Point09() {}
	
	public Point09(int x,int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public boolean equals(Object obj) {
		/* 문제)if 조건문과 형변환 유무 판단 연산자인 instanceof 를 추가 코드해서 명시적인 다운캐스팅이 되게 해 보자. 
		 */
		Point09 ptTmp = null;
		
		if(obj instanceof Point09) {//다운 캐스팅이 가능한가? 
		 ptTmp = (Point09)obj;//명시적인 다운캐스팅
		}
		
		if((x == ptTmp.x) && (y == ptTmp.y)) {//x,y 값만 비교
			return true;
		}else {
			return false;
		}		
	}//equals()	
}

public class InterEx09 {
	public static void main(String[] args) {
        Point09 pt01 = new Point09(10,20);
        Point09 pt02 = new Point09(10,20);
        
        if(pt01 == pt02) {//참조타입을 ==로 같다 비교하면 객체주소값을 비교한다. 객체주소가 달라서 false
        	System.out.println("두 레퍼런스가 같다.");
        }else {
        	System.out.println("두 레퍼런스가 다르다.");
        }
        
        if(pt01.equals(pt02)) {//값을 비교
        	System.out.println("값이 같다.");
        }else {
        	System.out.println("값이 다르다.");
        }
	}
}
