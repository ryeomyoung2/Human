package Exam_17.packA;

import Exam_17.packB.D;

public class B {	// public
	A a = new A();	
	// A는 default인데. 같은 PKG이므로 접근가능하다.
	B b = new B();	
	C c = new C();
	D d = new D();
}
