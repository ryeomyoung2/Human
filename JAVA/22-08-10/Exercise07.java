package Exam_03;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; // 현재의 잔고
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("---------------------");
			System.out.println("1.예금 / 2.출금 / 3.잔고 / 4.종료");
			System.out.println("---------------------");
			System.out.print("선택>");
			switch (scanner.next()) {
			case "1" :
				System.out.print ("예금액 : ");
				int a = scanner.nextInt();
				balance = balance + a; //balance += a;
				break;
			case "2" :
				System.out.print ("출금액 : ");
				balance = balance - scanner.nextInt(); 
				//balance -= scanner.nextInt();
				break;
			case "3" :
				System.out.printf ("잔고 : %d", balance);
				break;
			case "4" :
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("시스템이 종료되었습니다.");
	}
}
