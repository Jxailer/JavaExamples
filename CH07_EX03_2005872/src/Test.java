// 클래스 외부에서 멤버 호출하기
class A { 
	int m = 3;
	int n = 5;
	void abc() {
		System.out.println("안녕");
	}
	void bcd() {
		System.out.println("방가");
	}
	// 멤버 4개 : 필드 2개, 메서드 2개
}


public class Test {
	public static void main (String [] ar) {
		// #1. 객체 생성
		A a = new A();
		
		// #2. 멤버 사용
		System.out.println(a.m); // 필드 사용(필드값을 읽거나 수정함)
		System.out.println(a.n);
		a.abc(); // 메서드 사용(호출)
		a.bcd();
	}
}
