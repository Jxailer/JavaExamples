//  메서드 오버로딩

public class Test {
	public static void main (String [] ar) {
		abc(); // abc
		abc(2.8); // abc(double a)
		abc(3); // abc(int a)
		abc(2, 3); // abc(int a, int b)
		abc(1, 3, 2); // abc(int a, int b, int c)
		
		abc(1, 3, 2, 4);
		abc(1, 3, 2, 4, 5);
		abc(1, 3, 2, 4, 5, 6);
		abc(1, 3, 2, 4, 5, 6, 7);
		abc(1, 3, 2, 4, 5, 6, 7, 8);
	}
	
	public static void abc() { // abc
		System.out.println("1");
	}
	
	public static void abc(double a) { // abc, double
		System.out.println("2");
	}
	
	public static void abc(int a) { // abc, int
		System.out.println("3");
	}
	
	public static void abc(int a, int b) { // abc, int, int
		System.out.println("4");
	}
	
	public static void abc(int a, int b, int c) { // abc, int, int, int
		System.out.println("5");
	}
	
	public static void abc(int a, int b, int c, int d) { 
	}
	public static void abc(int a, int b, int c, int d, int e) { 
	}
	public static void abc(int a, int b, int c, int d, int e, int f) { 
	}
	public static void abc(int a, int b, int c, int d, int e, int f, int g) { 
	}
	public static void abc(int a, int b, int c, int d, int e, int f, int g, int z) { 
	}
}
