package exam06;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("------");
		Car bus1 = new Bus();
		bus1.run();
		System.out.println("------");
		Car mcar = new MicroCar();
		mcar.run();
		System.out.println("------");
		Car taxi = new Taxi();
		taxi.run();
		System.out.println("------");


	}

}
