
public class Test {
	public static void main(String [] ar) {
		//참, 거짓
		boolean a = true;
		boolean b = false;
		
		System.out.println(a);
		System.out.println(b);
		
		// 정수 4가지
		byte c = -3;
		short d = 5;
		int e = -6;
		long f = 9; // int를 long으로 바꾸는 업캐스팅. (L 생략 가능)
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
		// 실수 2가지
		float g = 2.8F; 
		// 왼쪽은 float, 오른쪽은 double. 다운캐스팅 이므로 직접 자료형을 변환해주어야함. (F 생략 불가.)
		double h = 5.8;
		double i = 5; // 5가 아닌 5.0으로 출력.
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
	}
}
