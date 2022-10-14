package Exam_17.packA;

import Exam_17.packB.D;
// 마지막은 클래스

class A {	// default
	A a = new A();	
	// A는 나 자신이므로 defalut라도 접근가능
	B b = new B();	
	// B는 public이므로 동일 Package인 A에서 접근 가능
	// public은 어디에서도 접근가능합니다.
	C c = new C();
	// C는 default 이므로 다른 Package인 A에서 접근 불가
	D d = new D();
	// D는 public이므로 import를 통해서 접근 가능.
}
