package exercise08;

public class Buyer {
	public int money ;	// 초기값 1000 ==> 900 ==> 700 ==> ... ==> 150
	public Product[] cart = new Product[10];
	public int index=0;		//==> 6번째.
	
	public Buyer(int money) {
		this.money = money;
	}
	
	public void buy(Product p) {		
		// Product p = new Tv(100,"TV"); //p.name="TV" // p.price=100
		// Product p = new Computer(200,"COMPUTER"); //p.name="COMPUTER" // p.price=200
		
		if (this.money < p.price) {		// this ==> buyer1 객체를 의미함.
			System.out.printf ("현재 잔액이 %d이기 때문에 제품(%s)를 살 수 없습니다. \n", this.money, p.price);
			return;
		}
		this.money = this.money - p.price;	//TV객체의 price를 차감. ==> Comp 가격차감
		
		this.add(p);
	}

	private void add(Product p) {		// Product p = new Tv(100,"TV");
		// 외부에서 호출하지 못하도록 private으로 설정.
		// 만약 외부에서 호출할 경우 잔액 점검도 안되고, 잔액 차감도 안되기 때문임.
		this.cart[index] = p;		// index=0에서 시작.
		System.out.printf ("Cart[%d] : %s \n", this.index, p.name);
		this.index = this.index + 1;
	}
	public void summary() {
		String itemList = "";
		int sum = 0;
		for (int i=0; i<cart.length; i++) {		//cart.length = 10
			if (cart[i] == null) {
				break;
			}
			itemList = itemList + this.cart[i].name + ",";	//TV,COMPUTER,TV,AUDIO,COMPUTER,COMPUTER,
			// cart[i].name ==> p.name
			sum = sum + this.cart[i].price;		// 100+200+100+50+200+200 = 850
		}
		
		System.out.println ("구입한 물건 : " + itemList);
		System.out.println ("총 사용금액 : " + sum);
		System.out.println ("현재잔액 : " + this.money);
		
	}

}
