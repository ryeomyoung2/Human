package Exam_03;

public class Exercise03 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int x=1; x<=100 ; x++) {
			if (x%3 == 0) {			// 3의 배수 조건에서.
				sum = sum + x;		// 1~100까지의 합을 구함. (3의배수만 포함)
				System.out.println (x);
			}
		}
		System.out.println ("sum = " + sum);
	}
}



//double x = Math.random();		// (0~1사이의 난수. 1은 미포함)
//// 1~6사이의 값을 만든다는 것은
//int a = (int) (x*6 +1) ;		//(0~6사이의 값이 나오게 됨. ==> 1~7사이의 값. 7은 미포함)
//// (int) casting에 의해 1,2,3,4,5,6