package exam06_01;

public class DriverExam {
	public static void main(String[]args) {
		Driver driver= new Driver();
		Bus b = new Bus();
		driver.drive(b);
		// Vehicle v = b
		// 자동타입변환 : 
		// 실제구현클래스의 내용을 인터페이스의 
		// 구현객체로 타입변환 가능 
		// Vehicle v = new Bus();
		Taxi t = new Taxi();
		driver.drive(t);
	}

}
