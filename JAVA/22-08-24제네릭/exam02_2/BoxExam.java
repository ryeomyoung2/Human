package exam02_2;

public class BoxExam {

	public static void main(String[] args) {
		Box<String> b1 = new Box<String>();
		b1.setBox("Human");
		String str1 = b1.getBox();
		System.out.println(str1);
		
		// 제네릭을 사용하면 강제타입변환 필요없음.
		// 왜냐하면 String으로 타입을 규정하였기 때문.
		
		Box<Integer> b2 = new Box<Integer>();
		b2.setBox(10);
		int intStr = b2.getBox();
		System.out.println(intStr);
	}
}
