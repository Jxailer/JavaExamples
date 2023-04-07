public class Test {
	public static void main(String[] args) {
		//if 제어문
		
		//중괄호의 생략
		int a=3;
		if(a>5) {
			System.out.println("실행1");
			System.out.println("실행2");
		}	
		// a>5가 false이므로 아무것도 실행되지 않음.
		
		if(a>5) 
			System.out.println("실행3"); // 중괄호 포함
			System.out.println("실행4"); // 중괄호 미포함. 출력됨.
			
			
		//type1
		if(a<4) {
			System.out.println("실행5");
		}
		if(a<2) {
			System.out.println("실행6");
		}
		
		//type 2
		// ex1
		int b;
		if(a>2) {
			b = 10;
		}
		else {
			b = 20;
		}
		// == (a>2)?b=10:b=20;
		
		// ex2
		if(a>2) {
			System.out.println("실행7");
		}
		else {
			System.out.println("실행8"); // a>2가 참이므로 출력되지 않음
		}
		
		// type 3
		// ex 1
		int score = 85;
		
		if(score>=90) {
			System.out.println("A");
		}
		else if(score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		
		// ex2
		if(score>=70) {
			System.out.println("C학점");
		}
		else if(score>=80) {
			System.out.println("B학점");
		}
		else if(score>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점");
		}

		// ex3

		if(70<=score && score<80) {
			System.out.println("C학점");
		}
		else if(80<=score && score<90) {
			System.out.println("B학점");
		}
		else if(score>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점");
		}
		
	}
	
}








