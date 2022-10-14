package Exam_04;

public class Exercise8 {

	public static void main(String[] args) {
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
//		System.out.println ("array.length : " + array.length);
//		System.out.println ("array[0].length : " + array[0].length);
//		System.out.println ("array[1].length : " + array[1].length);
//		System.out.println ("array[2].length : " + array[2].length);

		int sum = 0 ;
		int count = 0;
		double avg = 0.0; 
		for (int x=0; x<array.length; x++) {
			for (int y=0; y<array[x].length; y++) {
				sum = sum + array[x][y];
				count++;
			}
			
		}
		avg = (double)sum / (double)count ; 
		System.out.printf ("sum : %d \n", sum);
		System.out.printf ("avg : %f \n", avg);
	}

}
