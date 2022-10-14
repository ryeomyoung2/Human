package Exercise_05;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;

	void turnOff() {
//		if (this.isPowerOn == true) {
//			this.isPowerOn=false;
//		}
//		else {
//			this.isPowerOn=true;
//		}
		
		this.isPowerOn = ! this.isPowerOn;
	}

	void volumnUp() {
		if (this.volume < MAX_VOLUME)
			this.volume = this.volume + 1;
	}

	void volumnDown() {
		if (this.volume > MIN_VOLUME)
			this.volume = this.volume - 1;
	}

	void channelUp() {
		if (this.channel == MAX_CHANNEL) {		
			// this.channel이 100보다 큰 상황이 생길수도 있으니.. 좋은 않은 코드임.
			this.channel = MAX_CHANNEL;
		} 
		else {
			this.channel++;
		}
	}
	void channelDown() {
		if (this.channel == MIN_CHANNEL) {
			this.channel = MIN_CHANNEL;
		} 
		else {
			this.channel--;
		}
	}

}
