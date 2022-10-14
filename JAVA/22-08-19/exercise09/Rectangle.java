package exercise09;

public class Rectangle extends Shape{
	// 사각형을 표현할 수 있는 특성은 넓이와 높이인데, 
	// 이를 활용하여 면적을 구함.
	
	private int width;	// 넓이
	private int height;	// 높이

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 추상클래스 Shape을 상속받았기 때문에.
	// 오버라이드된 calcArea() 메서드를 꼭 구현해야 함.
	@Override
	public double calcArea() {
		return width*height;
	}
	

}
