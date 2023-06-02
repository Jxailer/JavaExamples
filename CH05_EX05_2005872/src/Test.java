
public class Test {
	public static void main (String [] ar) {
		// 2차원 배열의 선언
		int a1 [][];
		int [][]a2;
		int []a3[];
		
		// 2차원 배열의 선언과 초기화
		// 1 2
		// 3 4
		// 5 6
		// 7 8
		
		// 방법 1
		
		int [][] a = new int[4][2];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[2][0] = 5;
		a[2][1] = 6;
		a[3][0] = 7;
		a[3][1] = 8;
		
		// 방법 2
		int [][] b = new int[4][];
		b[0] = new int[] {1,2};
		b[1] = new int[] {3,4};
		b[2] = new int[2];
		b[2][0] = 5;
		b[2][1] = 6;
		// b[3] = {7,8};
		b[3] = new int[]{7,8};
		
		// 방법 3
		int[][] c = new int[][] {{1,2}, {3,4}, {5,6}, {7,8}};
		
		// 방법 4
		int[][] d = {{1,2}, {3,4}, {5,6}, {7,8}};
	}
}
