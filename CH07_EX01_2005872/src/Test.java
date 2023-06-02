class A {
	int m=3;
	int k;
	void abc() {
		int n = 5;
		int j;
		System.out.println(m);
		System.out.println(k);
		System.out.println(n);
		// System.out.println(j); // 오류. 지역변수는 초기화 이후에만 출력 가능함.
	}
}

public class Test {
	public static void main(String [] args) {
		//#1 객체 생성
		A a = new A();
		
		//#2 멤버 사용
		a.abc();
	}
}
