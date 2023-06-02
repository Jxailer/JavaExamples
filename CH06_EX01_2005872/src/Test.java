
class A{
	int m=3; // field
	void print() { // method
		System.out.println(m);
	}
}

public class Test {
	public static void main(String[] args) {
		// #1. 객체 생성
		A a1 = new A(); // 클래스 참조형 힙메모리에 넣어라
		A a2 = new A();
		
		// #2. 멤버 사용
		System.out.println(a1.m);
		System.out.println(a2.m);
		
		a1.m = 5;
		a2.m = 7;
		
		a1.print(); // 5
		a2.print(); // 7
	}
}
