package bcd;

import abc.A;


public class C {
	void cde() {
		// 객체 생성
		A a = new A();
		// 멤버 사용(a만 가능)
		System.out.println(a.a);
		// 다른 패키지에서는 public 멤버만 사용 가능.
		//System.out.println(a.b);
		//System.out.println(a.c);
		//System.out.println(a.d);
		
	}
}
