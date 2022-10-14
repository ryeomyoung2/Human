package Exam_03;

public class Exercise08 {

	public static void main(String[] args) {

	      boolean z=true;
	      int cnt=0;
	      while (z) {
	         if (cnt < 10) {
	            System.out.printf ("cnt : %d \n", cnt);
	         }
	         if (cnt > 10) {
	            break;            
	            // break를 만나면 반복문을 빠져나감.
	         }
	         cnt++;		//0==>1 / 4==>5 / 5 ==> 6
	         if (cnt>5) {
	            continue;         
	            // continue를 만나면.. 반복문의 시작점으로 돌아감.
	         }
	         System.out.println ("cnt가 5이하입니다.");
	      }
	}
}
