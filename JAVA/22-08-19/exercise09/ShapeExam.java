package exercise09;

public class ShapeExam {

	public static void main(String[] args) {
		Shape c1 = new Circle(10.0);
		System.out.printf ("원1의 넓이는 %f입니다. \n"
				, c1.calcArea());

		Shape c2 = new Circle(20.0);
		System.out.printf ("원2의 넓이는 %f입니다. \n"
				, c2.calcArea());
		
		Shape rect1 = new Rectangle(5, 5);
		System.out.printf ("사각형1의 넓이는 %f입니다. \n"
				, rect1.calcArea());

		Shape rect2 = new Rectangle(10, 5);
		System.out.printf ("사각형2의 넓이는 %f입니다. \n"
				, rect2.calcArea());

	}

}
