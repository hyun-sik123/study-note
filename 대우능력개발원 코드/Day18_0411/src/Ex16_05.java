/* 16장.상속.pdf의 No.26 4번문제) 
 */
class HandPhone extends Object{
	protected String model;//폰 모델
	protected String number; //폰번호
	
	public HandPhone() {}
	
	public HandPhone(String model, String number) {
		this.model = model;
		this.number = number;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getNumber() {
		return number;
	}
}//HandPhone 부모 클래스

class DicaPhone extends HandPhone{
	protected String pixel;//화소수
	
	public DicaPhone() {}
	
	public DicaPhone(String model, String number, String pixel) {
		super(model,number);
		this.pixel=pixel;
	}
	
	public void prnDicaPhone() {
		System.out.println("모델명:"+model+"  번호:"+number+" 화소수:"+pixel);
	}
}//DicaPhone 자손클래스

public class Ex16_05 {
	public static void main(String[] args) {
      DicaPhone dp=new DicaPhone("갤럭시","010","1024");
      dp.prnDicaPhone();
	}
}
