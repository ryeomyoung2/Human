package Exercise_03;

public class MyPointExam {

	public static void main(String[] args) {

		MyPoint myPoint = new MyPoint(1,1);
		
		double distance = myPoint.getDistance(2,2);
		
		System.out.printf ("distance : %f \n", distance);
	}

}
