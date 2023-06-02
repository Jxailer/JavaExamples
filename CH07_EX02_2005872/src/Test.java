// 필드의 강제초기화값
class A{
	boolean a;
	int b;
	double c;
	String d;
	void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
public class Test {
	public static void main(String [] args) {
		// #1 객체 생성
		A a = new A();
		// #2 멤버 호출0
		a.print();
	}

}
