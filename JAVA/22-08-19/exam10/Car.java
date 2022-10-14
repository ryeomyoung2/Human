package exam10;

public abstract class Car {
	// 차의 공통적인 특성을 설계단계에서 추상적으로 정의함.
	// 추상클래스는 상속을 받아서 구체화하는 자식클래스가 무조건 필요함.
	int currentSpeed = 100;
	public Car() {
	}
	public void driving() {
		System.out.println ("차가 달립니다.");
	}
	public void stop() {
		System.out.println ("차가 멈춥니다..");
	}
	

}
