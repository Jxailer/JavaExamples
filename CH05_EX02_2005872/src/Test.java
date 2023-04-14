public class Test {
	public static void main (String [] ar) {
		// 1차원 배열 생성 및 초기화 3가지 방법
		
		// a ----> [1.1, 2.2, 3.3]
		// 방법 1
		double [] a = new double[3];
		a[0] = 1.1;
		a[1] = 2.2;
		a[2] = 3.3;
		
		// 방법 2-1
		double [] b = new double[]{1.1, 2.2, 3.3}; // [] 안을 비워둬야함.
		
		// 방법 2-2
		double [] bb;
		bb = new double[] {1.1, 2.2, 3.3};
		
		// 방법 3
		double [] c = {1.1, 2.2, 3.3};
	}
}
