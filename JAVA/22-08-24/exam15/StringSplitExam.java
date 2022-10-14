package exam15;

public class StringSplitExam {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");
		// | 는 or의 개념임 ==> 즉, "&" , "," , "-" 기준으로 문자열을 잘라냄.
		// names[0]=홍길동
		// names[1]=이수홍
		// names[2]=박연수
		// names[3]=김자바
		// names[4]=최명호
		
		for (String n : names) {
			System.out.println(n);
		}
	}
}
