
//sealed 키워드로 봉인된 인터페이스 IntefaceA 정의 => permits키워드 다음에 정의된 InterfaceB만 자손 인터페이스로 정의가능
public sealed interface InterfaceA permits InterfaceB{

	void methodA();
}
