
public class Test {
	public static void main (String [] ar) {
		// while <=> do-while
		int a;
		
		a=0;
		while(a<3) {
			System.out.println(a);
			a++;
		} // 3 times
		
		a=0;
		do {
			System.out.println(a);
			a++;
		}while(a<3); // 3 times
		
		a=0;
		while(a<1) {
			System.out.println(a);
			a++;
		} // 1 time
		
		a=0;
		do {
			System.out.println(a);
			a++;
		}while(a<1); // 1 time		
		
		a=0;
		while(a<0) {
			System.out.println(a);
			a++; // 0 time
		}		
		a=0;
		do {
			System.out.println(a);
			a++;
		} while(a<0); // 1 time
		
		
		
		
	}
}
