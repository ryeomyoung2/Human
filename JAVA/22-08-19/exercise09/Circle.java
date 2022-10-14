package exercise09;

public class Circle extends Shape{
	// 원을 표현할 수 있는 특성은 반지름이고, 반지름을 활용하여 면적을 구함.
	// 또한 원을 구하기 위해서는 PI가 필요한데. 
	// PI는 아래와 같은 형태로 선언한 후 사용할 수도 있음
	
	private double r;
	private static final double PI = 3.141592;
//	public static final double PI = Math.PI;
	
	public Circle(double r) {
		this.r = r;
	}

	// 추상클래스 Shape을 상속받았기 때문에.
	// 오버라이드된 calcArea() 메서드를 꼭 구현해야 함.
	@Override
	public double calcArea() {
		return PI*r*r;
	}
	

}
