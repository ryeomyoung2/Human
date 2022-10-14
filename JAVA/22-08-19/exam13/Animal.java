package exam13;

public abstract class Animal {
	public String kind;  	// 하위클래스가 가리키는 종류
	
	public void breathe() { 
		System.out.println ("숨을 쉽니다.");
	}
	
	public abstract void sound();
	// 아직 어떤 동물인지 Animal입장에서는 확정안되었으므로 
	// 추상메서드로 활용

}
