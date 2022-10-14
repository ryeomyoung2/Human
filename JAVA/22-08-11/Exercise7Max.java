package Exam_04;

public class Exercise7Max {

	public static void main(String[] args) {
		int max = -9999;				// MAX를 구하기 위한 초기값이 작아야 한다.
		int [] arr = {1,5,3,8,2};
		
		for (int x=0; x<arr.length; x++) {
			if (max < arr[x]) {
				max = arr[x];
			}
			System.out.printf ("MAX[0~%d]  : %d \n", x, max);
		}
		System.out.printf ("MAX : %d \n", max);
	}
}
