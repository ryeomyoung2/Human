package Exam_04;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		boolean run = true;			
		int studentNum = 0;				// 전역변수로 처리하고 있는 이유. 
		int[] scores = null;
//		int[] scores = {0,0,0,0,0,0,0,0,0,0};
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println ("---------------------------------------------");
			System.out.println ("1.학생수 / 2.점수입력 / 3.점수리스트 / 4.분석 / 5.종료");
			System.out.println ("---------------------------------------------");
			System.out.print ("선택 > ");
			
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];		// 학생수만큼 배열의 크기가 지정된다.
			}
			else if (selectNo == 2) {
				for (int x=0; x<studentNum ; x++) {	//{0,1,2}
					System.out.printf("score[%d] : ", x);
					scores[x] = sc.nextInt();
				}
			}
			else if (selectNo == 3) {
				for (int x=0; x<studentNum ; x++) {
					System.out.printf("score[%d] : %d \n", x, scores[x]);
				}
			}
			else if (selectNo == 4) {
				int max = 0; 
				int sum = 0;
				double avg = 0.0;
				
				for (int x=0; x<studentNum ; x++) {
					if (max < scores[x]) {
						max = scores[x];
					}
					sum = sum + scores[x]; 
				}
//				avg = (double)sum / (double)studentNum;			
				avg = (double)sum / (double)scores.length;
				System.out.printf ("max : %d \n", max);
				System.out.printf ("avg : %f \n", avg);
			}
			else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println ("프로그램 종료합니다.");
	}
}
