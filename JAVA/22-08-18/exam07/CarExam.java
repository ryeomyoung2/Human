package exam07;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Bus();
		car1.run();
		System.out.println("-----------");
		// 제가 경차를 한대 샀음.
		// 그차로 출근합니다.
		
		Car car2 = new MicroCar();
		car2.run();
		
		// 택시타고 다님.
		
		Car car3 = new Taxi();
		car3.run();
		
		
	}

}
