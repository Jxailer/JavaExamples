
public class Test {
	public static void main (String [] ar) {
		// 시프트 연산자(<<, >>)
		System.out.println(7<<1); // 7에 2를 곱함. 14
		System.out.println(7<<2); // 7에 2^2를 곱함. 28
		System.out.println(-7<<1); // -7에 2를 곱함. -14
		System.out.println(-7<<2); // -7에 2^2를 곱함. -28
		System.out.println( );
		
		System.out.println(7>>1); // 7을 2로 나누고 나머지를 버린 값. 3
		System.out.println(7>>2); // 7을 2^2로 나누고 나머지를 버린 값. 1
		System.out.println(-7>>1); // -7을 2로 나누고 나머지를 올린 값. -4
		System.out.println(-7>>2); // -7을 2^2로 나누고 나머지를 올린 값. -2
		System.out.println( );
		
		// 논리 시프트(>>>)
		int a = 0b10110011;
		// 1과 & 연산 했을 때 마지막 비트의 값을 출력할 수 있음.
		
		System.out.println((a>>>0)&1); // 1
		System.out.println((a>>>1)&1); // 1
		System.out.println((a>>>2)&1); // 0
		System.out.println((a>>>3)&1); // 0
		System.out.println((a>>>4)&1); // 1
		System.out.println((a>>>5)&1); // 1
		System.out.println((a>>>6)&1); // 0
		System.out.println((a>>>7)&1); // 1
		
	}
}
