package exam11;

public class Bus extends Car{
	@Override
	public int speedUp() {
		currentSpeed = currentSpeed + 1;
		return currentSpeed;
	}
	@Override
	public int getCharge() {
		return 1200;
	}

}
