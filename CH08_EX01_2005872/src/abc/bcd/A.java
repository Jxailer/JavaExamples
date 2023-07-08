package abc.bcd;
import cde.def.B;

public class A {
	void abc() {
		// 클래스 B의 객체 생성
		// B b = new B(); 오류. 이름만 사용하는 것은 불가능.
		// 해결방법 1. 풀네임 사용.
		cde.def.B b = new cde.def.B();
		
		// 해결방법 2. import 후 이름만 사용하기
		B b2= new B();
		
		// 클래스 C의 객체 생성
		C c = new C(); // package가 같기 떄문에 이름만 써도 사용할 수 있음.
	}
}
