package Exercise_03;

public class MyPoint {
	public int x;
	public int y;
	
	public MyPoint (int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(int x, int y) {
		double distance ;
		System.out.printf ("this.x : %d \n", this.x);
		System.out.printf ("this.y : %d \n", this.y);
		System.out.printf ("x : %d \n", x);
		System.out.printf ("x : %d \n", y);
		
		distance = Math.sqrt( (this.x-x)*(this.x-x) + (this.y-y)*(this.y-y) );
		return distance;
	}
	

}
