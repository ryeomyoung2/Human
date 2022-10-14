package Exercise_05;

public class MyTvExam {

	public static void main(String[] args) {
		
		MyTv myTv = new MyTv();
		myTv.channel = 100;
		myTv.volume = 0;
		System.out.println ("CH : " + myTv.channel + ", VOL : " + myTv.volume);
		
		myTv.channelDown();
		myTv.volumnDown();
		System.out.printf ("CH : %d, VOL : %d \n", myTv.channel, myTv.volume);

		myTv.volume = 100;
		myTv.channelUp();
		myTv.volumnUp();
		System.out.printf ("CH : %d, VOL : %d \n", myTv.channel, myTv.volume);

	}

}
