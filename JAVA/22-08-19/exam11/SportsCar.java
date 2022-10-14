package exam11;

public class SportsCar extends Car{
	// 부모인 Car에서 추상메서드가 있으니 꼭 구현바람.
	@Override	// annotation
	public int speedUp() {
		currentSpeed = currentSpeed + 10;
		return currentSpeed;
	}
	@Override
	public int getCharge() {
		return 1450;
	}
}
