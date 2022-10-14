package exercise09;

public abstract class Shape {
	// 설계자가 원하는 기능은 면적을 구하는 기능임.
	// 그래서 실체화된 클래스에서 구현해야 할 클래스는 
	// 꼭 면적을 구해야 하는 calcArea() 메서드가 있어야 함.
	// 이를 설명하는 것이 아래의 추상메서드임 
	// 추상메서드가 포함된 클래스는 추상클래스로 선언해야 함.
	public abstract double calcArea();

}
