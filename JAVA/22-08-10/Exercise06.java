package Exam_03;

public class Exercise06 {
	public static void main(String[] args) {

/*
1번 문제
*				// y=1 ==> x= 1~1
**				// y=2 ==> x= 1~2
***				// y=3 ==> x= 1~3
****			// y=4 ==> x= 1~4
*****			// y=5 ==> x= 1~5
*/
	
//		for (int y = 1; y<=5; y++) {
//			for (int x = 1; x<=y; x++) {
//				System.out.print ("*");
//			}
//			System.out.println ();			
//		}
		
//		for (int y = 1; y<=5; y++) {
//			for (int x = 1; x<=5; x++) {
//				System.out.print ("*");
//				if (x==y) {
//					System.out.println();			
//					break;
//				}
//			}
//		}
		
/*		
2번 문제
*****		// y=1 ==> x= 1~5
****		// y=2 ==> x= 1~4
***			// y=3 ==> x= 1~3
**			// y=4 ==> x= 1~2
*			// y=5 ==> x= 1~1

*/

//		for (int y = 1; y<=5; y++) {
//			for (int x = 1; x<=5-y+1; x++) {		// x+y<=6
//				System.out.print ("*");
//			}
//			System.out.println ();			
//		}
		
//		for (int y = 1; y<=5; y++) {
//			for (int x = 1; x<=5; x++) {
//				if (x+y <= 6) {
//					System.out.print ("*");
//				}
//				else {
//					break;
//				}
//			}
//			System.out.println ();			
//		}

/*		
// 1칸씩 띄워주는 것은 System.out.print(" ");
3번 문제
    *		// y=1; 띄어쓰기(x) 1~4, *(z):5~5
   **		// y=2; 띄어쓰기(x) 1~3, *(z):4~5
  ***		// y=3; 띄어쓰기(x) 1~2, *(z):3~5
 **** 		// y=4; 띄어쓰기(x) 1~1, *(z):2~5
*****		// y=5; 띄어쓰기(x) 없음, *(z):1~5

*/
//		for (int y = 1; y <= 5; y++) {
//			for (int x = 1; x+y <= 5; x++) { 
//				System.out.print(" ");
//			}
//			for (int z = 6-y ; z <= 5; z++) { 
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
/*		
4번 문제
*****		// y=1; 띄어쓰기(x) 없음, *(z):1~5
 **** 		// y=2; 띄어쓰기(x) 1~1, *(z):2~5
  ***		// y=3; 띄어쓰기(x) 1~2, *(z):3~5
   **		// y=4; 띄어쓰기(x) 1~3, *(z):4~5
    *		// y=5; 띄어쓰기(x) 1~4, *(z):5~5

*/
		for (int y = 1; y <= 5; y++) {
			for (int x = 1; x <= y-1; x++) { 
				System.out.print(" ");
			}
			for (int z = y ; z <= 5; z++) { 
				System.out.print("*");
			}
			System.out.println();
		}
	

	}
}
