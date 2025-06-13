package 제3장문제풀이;

public class DataEx03 {
	public static void main(String[] args) {
      byte var01=127;
      short var02=128;
      int var03=128;
      long var04=128L;
      
      var04=var01;//암묵적인 자동형변환(byte->long)
      System.out.println("var01="+var01+",var04="+var04);
      
      var01=(byte)var03;//캐스팅 연산자 (byte)를 사용해서 명시적인 형변환을 한다. byte 최대값 범위를 벗어나서 최소값이 저장된다.
      System.out.println("var01="+var01+",var03="+var03);
      
      float var05=123456.789123f;
      double var06=123456.789123;//값뒤에 접미사 d or D가 생략됨
      System.out.println("var05="+var05);
      
      var05=(float)var06;
      System.out.println("var05="+var05);
      System.out.println("var06="+var06);
      
      //5번 변수 선언 문제풀이
      //boolean false;//false는 예약어라서 변수명으로 사용할 수 없다.
      //int default; //default도 예약어라서 변수명으로 사용 불가능
      String _object;//_로 시작되는 변수명 사용가능
      //double a-class;//변수명에 - 가 포함되어서 에러가 난다.
	}
}
