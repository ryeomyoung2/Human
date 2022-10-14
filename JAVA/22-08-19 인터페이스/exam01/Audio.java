package exam01;

public class Audio implements RemoteControl {
	private int volumn;
	
	@Override
	public void turnOn() {
		System.out.println("Audio 켜다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 끄다");
	}

	@Override
	public void setVolume(int volumn) {
		this.volumn = volumn;		
	}

}
