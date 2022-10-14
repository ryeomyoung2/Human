package Exam_04.ClassCar;

public class CarExam {

	public static void main(String[] args) {
	      Car car1 = new Car();    // Car의 객체 생성
	      // car1의 속성의 정의
	      car1.company = "현대자동차";
	      car1.model = "그랜져";
	      car1.maxSpeed = 300;
	      car1.currentSpeed = 100;
	      
	      Car car2 = new Car();    // Car의 객체 생성
	      // car1의 속성의 정의
	      car2.company = "기아자동차";
	      car2.model = "K7";
	      car2.maxSpeed = 250;
	      car2.currentSpeed = 80;

	      System.out.println(car1.company);
	      System.out.println(car1.model);
	      System.out.println(car1.maxSpeed);
	      System.out.println(car1.currentSpeed);
	      System.out.println ("------------------------------------------");
	      
	      System.out.println(car2.company);
	      System.out.println(car2.model);
	      System.out.println(car2.maxSpeed);
	      System.out.println(car2.currentSpeed);

	}

}
