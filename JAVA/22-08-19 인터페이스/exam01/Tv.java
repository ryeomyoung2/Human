package exam01;

public class Tv implements RemoteControl{

	private int volumn;
	@Override
	public void turnOn() {
		System.out.println("TV 켜다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 끄다");
	}

	@Override
	public void setVolume(int volumn) {
		this.volumn = volumn;		
	}

//	public void setMute() {
//	System.out.println("볼륨을 10으로 하다");
//}


}
