package exam01;

public class RemoteControlExam {
	public static void main(String[] args) {
		Tv tv = new Tv();
		RemoteControl rc1 = tv;
		// RemoteControl rc1 = new Tv();
		// 앞은 인터페이스 - 뒤는 구현클래스
		// rc는 구현객체라고 하고.
		// Tv는 구현클래스라고 합니다.
		// new Tv==> new Audio로 바꾸면 구현 가능함.
		rc1.turnOn();
		rc1.setVolume(20);
		rc1.setMute(false);
		rc1.turnOff();
		// TV(구현클래스)에서 오버라이드하면 
		// 구현클래스의 메서드 실행됨.
		RemoteControl.changeBatt();
		// static 메서드는 인터페이스명으로 접근함.
		
		Audio ad = new Audio();
		RemoteControl rc2 = ad;
		// 앞은 인터페이스 - 뒤는 구현클래스
		// rc는 구현객체라고 하고.
		// Tv는 구현클래스라고 합니다.
		// new Tv==> new Audio로 바꾸면 구현 가능함.
		rc2.turnOn();
		rc2.setVolume(20);
		rc2.setMute(false);
		rc2.turnOff();
		// TV(구현클래스)에서 오버라이드하면 
		// 구현클래스의 메서드 실행됨.
		RemoteControl.changeBatt();
		// static 메서드는 인터페이스명으로 접근함.
	}
}
