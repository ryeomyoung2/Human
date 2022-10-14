package exam02;

public class Child extends Parent{
	public Child() {
//		super();
		super(10);
		// 부모생성자가 호출..
		// 상속을 받은 자식클래스의 생성자는 
		// super 호출을 기본으로한다.
		// super 호출은 한번만 꼭 해야함.
		System.out.println ("Child 생성자 호출");
	}
	public Child(int i) {
//		super(i);
		super();
		System.out.println ("인자가 있는 Child 생성자 호출");
	}

}
