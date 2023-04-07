
public class Test {
	public static void main (String [] ar) {
		// while <=> for
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		
		
		// write how many is A printed
		int a=0;
		while(a<10) {
			System.out.println("A");
			a++;
		} // 10
		
		a=0;
		while(a<10) {
			System.out.println("A");
			a+=2;
		} //5
		
		a=10;
		while(a>0) {
			System.out.println("A");
			a--;
		} // 10
		
		a=10;
		while(a>0) {
			System.out.println("A");
			a-=2;
		} // 5
		
		a=0;
		while(a<10) {
			a++;
			System.out.println("A");
		} // 10 (1~10)
	}
}
