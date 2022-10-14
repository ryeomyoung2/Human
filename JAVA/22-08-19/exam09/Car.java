package exam09;

public class Car {
	public int money;
	public Car() {
		System.out.println ("Car 객체 생성");
	}
	public int getCharge() {
		int money = 1600;
		System.out.printf ("일반적인 교통요금 : %d \n", money);
		return money;
	}

}

