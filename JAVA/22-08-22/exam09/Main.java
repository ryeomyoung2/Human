package exam09;

public class Main {

	public static void main(String[] args) {
		int value = 120;
		Test t = new Test();
		try {
			t.test(value);
		}
		catch (Exception e) {
			System.out.println ("예외 발생");
		}
		System.out.println ("시스템 종료");
	}
}
