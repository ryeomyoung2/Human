package exam18;

import java.util.Arrays;
import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		
		long seed1;
		
		seed1= System.currentTimeMillis(); 
		// 현재시간을 기준으로 seed 생성

		int[] selectNum = new int[6];

//		Random random = new Random(3);
		Random random = new Random(seed1);
		// 컴퓨터에서 난수를 발생시키는 기준인 seed라는 것이 있음.
		// 3은 seed를 의미함.
		System.out.print("선택번호 : ");
		for (int i = 0; i < 6; i++) {
			selectNum[i] = random.nextInt(45) + 1;
			// nextInt는 1~45사이의 난수를 뽑는 것. 중복되지 않게..
			System.out.printf("%d ", selectNum[i]);
		}

		System.out.println();

		seed1= System.currentTimeMillis();
		// 현재시간을 기준으로 seed 재생성

		int[] winningNum = new int[6];
//		random = new Random(5);
		random = new Random(seed1);
		// 3으로 바꾸면 seed가 동일하므로 같은 수 나옴.
		System.out.print("당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			winningNum[i] = random.nextInt(45) + 1;
			System.out.printf("%d ", winningNum[i]);
		}

		System.out.println();
		System.out.println("-----------------");

		Arrays.sort(selectNum);
		Arrays.sort(winningNum);
		boolean result = Arrays.equals(selectNum, winningNum);
		System.out.print("당첨여부 : ");
		if (result)
			System.out.println("당첨되었습니다.");
		else
			System.out.println("당첨되지 못했습니다..");
	}

}
