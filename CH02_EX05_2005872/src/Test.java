
public class Test {
	public static void main (String[] ar) {
		//업캐스팅(upcasting)
		long a = 3;
		double b = 3.5F;
		float c = 6;
		
		// 다운캐스팅(downcasting)
		int d = (int) 3.9;
		float e = (float) 5.8;
		short f = 3; // (int) 생략 가능한 케이스
		byte g = (byte) 130; // 값의 범위를 벗어남
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
