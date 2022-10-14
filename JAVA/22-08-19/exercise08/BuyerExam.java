package exercise08;

public class BuyerExam {

	public static void main(String[] args) {
		int tvPrice = 100;
		int compPrice = 200;
		int audioPrice = 50;
		Buyer buyer1 = new Buyer(1000);
		
		Tv tv = new Tv(tvPrice, "TV");
		Computer comp = new Computer(compPrice, "COMPUTER");
		Audio audio = new Audio(audioPrice, "AUDIO");

		buyer1.buy(tv);	//100
		buyer1.buy(comp); //200
		buyer1.buy(tv); //100
		buyer1.buy(audio); //50
		buyer1.buy(comp);//200
		buyer1.buy(comp);//200
		buyer1.buy(comp);// 못사야함.
		
		buyer1.summary();
		
/*
		Buyer buyer2 = new Buyer(2000);

		buyer2.buy(tv);
		buyer2.buy(comp);
		buyer2.buy(tv);
		buyer2.buy(audio);
		buyer2.buy(comp);
		buyer2.buy(comp);
		buyer2.buy(comp);
		
		buyer2.summary();
*/		
	}

}
