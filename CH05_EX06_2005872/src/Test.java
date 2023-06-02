
public class Test {
	public static void main (String [] ar) {
		// 비정방 행렬 생섬 및 초기화 3가지 방법
		
		// 1 2
		// 3
		// 4 5 6
		
		// 방법 1
		int [][] a = new int [3][];
		a[0] = new int[] {1,2};
		a[1] = new int[] {3};
		a[2] = new int[] {4, 5, 6};
		
		// 방법 2
		int[][] b = new int[][] {{1,2}, {3}, {4, 5, 6}};
		
		// 방법 3
		int [][] c = {{1,2}, {3}, {4, 5, 6}};
		
	}
}
