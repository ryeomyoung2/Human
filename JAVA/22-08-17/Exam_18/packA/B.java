package Exam_18.packA;

public class B {
	public static void main (String[] args) {
		A a1 = new A(true); 
		// public은 동일 PKG이므로 OK.
		A a2 = new A(10); 
		// private은 동일 PKG라도 생성자 접근 안됨.
		// private은 동일 클래스에서만 접근 가능
		A a3 = new A(1.1, 5);
		// default인 경우는 동일PKG에서 접근 가능
	}
}
