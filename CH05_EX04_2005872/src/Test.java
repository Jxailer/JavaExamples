
public class Test {
	public static void main (String [] ar) {
		// length, 원소값 출력
		double [] a = {1.1, 2.2, 3.3, 4.4};
		System.out.println(a.length); // 4
		
		for (int i=0; i<4; i++) {
			System.out.println(a[i]);
		} // 1.1 2.2 3.3 4.4
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		} // 1.1 2.2 3.3 4.4 a.length 사용 권장!
		
		//for each
		for(double k:a) {
			System.out.println(k);
		}
	}
}
