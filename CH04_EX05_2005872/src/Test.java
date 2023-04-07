
public class Test {
	public static void main (String [] ar) {
		// for 반복 제어문
		int a;
		for(a=0; a<3; a++) {
			System.out.println(a);
		}
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}
		
		
		// write how many times is A printed.
		for(int i=0; i<10; i++) {
			System.out.println("A");
		} //10
		
		for(int i=1; i<=10; i++) {
			System.out.println("A");
		}
		//10
		
		for(int i=10; i>0; i--) {
			System.out.println("A");
		} //10
		
		for(int i=0; i<10; i+=2) {
			System.out.println("A");
		} //5
		
		for(int i=0; i<10; i+=3) {
			System.out.println("A");
		} //4
		
		for(int i=10; i>0; i-=2) {
			System.out.println("A");
		} //5
		
		for(int i=0; i>5; i++) {
			System.out.println("A");
		} //0
		
		for(int i=5; i>0; i++) {
			System.out.println("A");
		} //infinite
		
		//for(int i=0; ;i++) {
			//System.out.println("A");
		//} // infinite
		
		for(;;) {
			System.out.println("A");
		} // unreachable code
	}
}
