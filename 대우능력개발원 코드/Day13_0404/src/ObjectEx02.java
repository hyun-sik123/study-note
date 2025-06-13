/* Animal02클래스를 설계할 때 클래스 소속 변수인 속성 즉 멤버변수를 private 으로 정의한 경우 어떻게 처리하는 지에 대한 소스이다. 
 */
class Animal02{
	String name;
	private int age;//age 멤버변수인 속성은 private 으로 정의되어 있기 때문에 Animal02 클래스 외부에서 접근 못함.데이터 보안성.
	//값을 저장할 때는 setter()메서드를 호출해서 사용하고, 값을 반환할 때는 getter()메서드를 호출해서 사용한다.
	
	public void setAge(int new_age) {//set+속성명(멤버변수명으로 가고 첫글자는 영문대문자로 한다) =>setAge()
		//값 저장메서드이다.통칭해서 setter()메서드라고 한다.
		age = new_age;
	}
	
	public int getAge() {//get+멤버변수명(속성명: 첫글자는 영문대문자로 한다.) => 값반환 메서드라고 한다.통칭해서 getter()메서드
		return age;
	}
}

public class ObjectEx02 {
	public static void main(String[] args) {

		Animal02 a;//객체주소가 저장안된 참조변수
		a=new Animal02();//객체주소가 저장된 참조변수=>a를 객체명
		
		a.name="홍길동";
		//a.age=25; //a멤버변수가 private으로 정의되어 있어서 외부클래스에서 접근 못함
		a.setAge(25);//setter()메서드를 호출해서 나이를 저장
		
		System.out.println("이름:"+a.name+",나이:"+a.getAge());
	}
}
