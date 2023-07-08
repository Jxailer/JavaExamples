// this() 메서드
class A{
	A(){
		this(1, 1);
		System.out.println("1");
	}
	A(int a){
		System.out.println("2");
	}
	A(int a, int b){
		this(2.1);
		System.out.println("3");
	}
	A(double a){
		this(1);
		System.out.println("4");
	}
}

public class Test {
	public static void main(String [] ar) {
		// # 객체 생성
		A a = new A(); //2->4->3->1
	}
}
