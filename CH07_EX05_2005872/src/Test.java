import java.util.Arrays;

class A {
	
}

public class Test {
	
	public static void main (String [] ar) {
		int a=7;
		abc(a); // static 메서드는 static 외부 메서드만 호출이 가능함.
		System.out.println(a);
		
		int [] b = {1, 2, 3};
		bcd(b);
		System.out.println(Arrays.toString(b)); // [4, 5, 6]
	}
	public static void abc(int a) {
		a+=10;
		System.out.println(a);
	}
	public static void bcd(int [] b) {
		b[0] = 4; b[1] = 5; b[2] = 6;  
		System.out.println(Arrays.toString(b)); // [4, 5, 6]
	}
	
}
