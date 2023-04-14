
public class Test {
	public static void main (String [] ar) {
		// 배열의 선언
		int [] a1;
		int a2[];
		
		// 배열의 객체 생성
		int []a = new int[3];
		System.out.println(a[0]); // 0
		System.out.println(a[1]); // 0
		System.out.println(a[2]); // 0
		
		a[0] = 3; a[1] = 4; a[2] = 5;
		System.out.println(a[0]); // 3
		System.out.println(a[1]); // 4
		System.out.println(a[2]); // 5
		
		double[] b = new double[3];
		System.out.println(b[0]); // 0.0
		System.out.println(b[1]); // 0.0
		System.out.println(b[2]); // 0.0
		
		b[0] = 3.3; b[1] = 4.4; b[2] = 5.5;
		System.out.println(b[0]); // 3.3
		System.out.println(b[1]); // 4.4
		System.out.println(b[2]); // 5.5
		
		String[] c = new String[3];
		System.out.println(c[0]); // null
		System.out.println(c[1]); // null
		System.out.println(c[2]); // null
		
		c[0] = "땡큐"; c[1] = "베리"; c[2] = "감사";
		System.out.println(c[0]); // 땡큐
		System.out.println(c[1]); // 베리
		System.out.println(c[2]); // 감사

	}
}
