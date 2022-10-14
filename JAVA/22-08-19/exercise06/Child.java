package exercise06;

public class Child extends Parent{
	private String name;
	public Child() {
		this("강현준");
		System.out.println ("Child() 호출");
	}
	public Child(String name) {
		this.name = name;
		System.out.println ("Child(String) 호출");
	}
}
