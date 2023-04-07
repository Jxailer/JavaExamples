
public class Test {
	public static void main(String [] ar) {
		// switch <=> if
		
		// mission 1
		int a = 8;
		switch(a) {
		case 10:
			System.out.println("A"); break;
		case 9:
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C");
		case 6:
			System.out.println("D"); break;
		}
		
		// mission 1 into if
		
		if(a==10) {
			System.out.println("A");
		}
		else if(a>=8) {
			System.out.println("B");
		}
		else if(a==7) {
			System.out.println("C");
		}
		else if(a==6) {
			System.out.println("D");
		}
		
		
		
		
		// mission 2
		a=85;
		if (a>=90) {
			System.out.println("A");
		}
		else if (a>=80) {
			System.out.println("B");
		}
		else if (a>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		
		// mission 2 into switch (use case 5 times)
		int b = a / 10;
		switch(b) { // a/10
		case 10:
		case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		default :
			System.out.println("F");
		}
	
	}
		
}
