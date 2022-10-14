package exam15;

public class StringSubStringExam {

	public static void main(String[] args) {
		String ssn = "761230-123456";
		String first = ssn.substring(0,6);
		// 0~6까지. 문자열 잘라냄.
		String second = ssn.substring(7);
		// 7~끝까지. 문자열 잘라냄.
		
		System.out.println(first);
		System.out.println(second);
		
		

	}

}
