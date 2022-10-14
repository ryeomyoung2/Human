package exam10;

public class SportsCar extends Car{
	public int speedUp() {
		this.currentSpeed++;
		// currentSpeed라는 변수가 메서드내에서 사용되지 않으므로
		// this를 생략할 수 있다.
		// 즉, this를 생략하더라도 멤버변수 currentSpeed을 사용한다.
		return this.currentSpeed;
	}
	public int getCharge() {
		return 1450;
	}

}
