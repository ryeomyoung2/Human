package Exam_17.packB;

import Exam_17.packA.B;

class C {	// default
	A a = new A();	
	// A는 default 이므로 다른 Package인 B에서 접근 불가
	B b = new B();	
	// B는 pubic이므로 다른 Package인 B에서 import문으로 접근 가능
	C c = new C();
	// C는 나 자신이므로 defalut라도 접근가능
	D d = new D();
	// D는 public이므로 동일 Package인 C에서 접근 가능
}
