// 클래스 내부에서 멤버 호출하기
class A { 
	int m = 3;
	int n = 5;
	void abc() {
		System.out.println("안녕");
		System.out.println(m);
		System.out.println(n);
		// 클래스 내부의 멤버를 호출할 때는 참조변수명을 표시할 필요가 없음.
	}
	void bcd() {
		abc();
		System.out.println("방가");
	}
}


public class Test {
	public static void main (String [] ar) {
		// #1. 객체 생성
		A a = new A();
		
		// #2. 멤버 사용
		a.abc();
		a.bcd();
	}
}
