
public class Test {
	public static void main(String[] args) {
		// 산술 연산자
		System.out.println(7+4);
		System.out.println(7-4);
		System.out.println(7*4);
		System.out.println(7/4); // 몫 연산 1
		System.out.println(7%4); // 나머지 연산 3
		System.out.println( );

		// 증감 연산자
		int a = 3;
		int b = a ++; // a가 1 증가함.
		System.out.println(a); // 4
		System.out.println(b); // 3
		System.out.println( );
		
		a = 3;
		b = ++a; // a에 1을 증가 시킨 후, b에 대입됨.
		System.out.println(a); // 4
		System.out.println(b); // 4
		System.out.println( );
		
		a = 3;
		System.out.println(a++); // a값을 출력한 후 1을 증가시킴. 3
		System.out.println(++a); // a값을 1 증가시킨 후 출력함. 5
		System.out.println( );
		
		a = 3;
		b = 4;
		int c = a++ + ++b; // a와 b값을 1 증가시킨 값을 대입한 후, a값 1 증가.
		System.out.println(a); // 4
		System.out.println(b); // 5
		System.out.println(c); // 8
		
	}
}
