package abc;

public class A {
	public int a;
	protected int b;
	int c; // default, package
	private int d;
	
	void abc() {
		// 멤버 사용 (a, b, c, d)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
