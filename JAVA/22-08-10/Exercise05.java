package Exam_03;

public class Exercise05 {

	public static void main(String[] args) {
		//2중 for문을 통해서 4x+5y=60인 것만 출력하자.
		// x,y는 1~10 임.
		
		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				if (4*x+5*y == 60) {
					System.out.printf ("(%d, %d) = %d\n", x, y, 4*x+5*y);
				}
			}
		}
	}
}
