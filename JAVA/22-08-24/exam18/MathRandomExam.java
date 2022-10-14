package exam18;

public class MathRandomExam {

	public static void main(String[] args) {
		 int num1 = (int) (Math.random()*6) +1;
		 // 0 <= Math.random() < 1		==> 실수
		 // 0 <= Math.random()*6 < 6	==> 실수
		 // 1 <= ((Math.random()*6) + 1) < 7	==> 실수
		 // (int) (6.2) ==> 6
		 // (int) (6.9) ==> 6
		 // int는 소수점 버림.
		 // 이를 int형으로 바꾸면, 1,2,3,4,5,6 중 하나를 갖게 됨.
		 
	      int num2 = (int) (Math.random()*45) + 1;
	      // 1~45사이의 정수.
	      
	      System.out.println ("주사위 눈 : " + num1);
	      System.out.println ("로또 : " + num2);
	}

}
