// this 키워드 (자기 자신 클래스의 객체를 가리키는 참조변수)
class A {
	int m;
	int n;
	void abc(int a, int b) { // this. 생략시 컴파일러가 자동 추가(총 5군데)
		this.m=a;
		this.n=b;
		System.out.println(this.m);
		System.out.println(this.n);
		this.bcd();
	}
	void bcd() {
		System.out.println("bcd() 메서드");
	}
}

class B {
	int m;
	int n;
	void abc(int m, int n) {
		this.m=m;
		this.n=n;
		System.out.println(m);
		System.out.println(n);
		this.bcd(); // this. 생략시 컴파일러가 자동 추가(총 1군데)
	}
	void bcd() {
		System.out.println("bcd() 메서드");
	}
}

public class Test {
	public static void main (String [] ar) {
		
	}
}
