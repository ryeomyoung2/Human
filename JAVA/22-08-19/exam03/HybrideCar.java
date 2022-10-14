package exam03;

public class HybrideCar extends Car{
	int elec;
	public HybrideCar() {
		System.out.println ("HybrideCar() 생성");
	}
	public HybrideCar(int elec) {
		this.elec = elec;
		System.out.printf ("HybrideCar(%d) 생성\n", this.elec);
	}
	public HybrideCar(int elec, int oil) {
		super();
		this.elec = elec;
		this.oil = oil;
		System.out.printf ("HybrideCar(%d, %d) 생성\n"
				, this.elec, this.oil);
	}
	
}
