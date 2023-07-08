package bcd;

import abc.A;

public class D extends A{ 
	// D는 A를 상속받아 자식 클래스가 됨.
	// A만 쓰면 패키지가 다르기 때문에 호출할 수 없음.
	void def() {
		// 멤버 사용
				System.out.println(a);
				System.out.println(b); 
				// 자식클래스인 경우는 다른 패키지라도 protected는 사용 가능.
				//System.out.println(c);
				//System.out.println(d);
	}
	
}
