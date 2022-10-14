package exam07;

public class Human {

	public static void main(String[] args) {
		
		try {
			Human human1 = new Human();
			human1.run();
			human1 = null;
			// case1 : NullPointException 발생 사례
			human1.run();
			
			Human human2 = new Human();
			human2.run();
			//case2 : NumberFormatException
			//발생한 예외에 대해서 처리를 하지 않는다면. finally를 수행한 후 시스템은 강제종료됨.
			String str = "a100";
			int intStr = Integer.parseInt(str);
			System.out.println ("intStr : " + intStr);
		}
		catch(NullPointerException | NumberFormatException e) {
			// |는 or의 개념임.
			System.out.println("Null-Point 또는 Number-Format 예외가 발생했습니다.");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally를 실행합니다..");
		}
		System.out.println("시스템을 종료합니다.");
	}

	private void run() {
		System.out.println ("사람이 달리다");
		
	}

}
