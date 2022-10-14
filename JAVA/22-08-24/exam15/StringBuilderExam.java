package exam15;

public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		sb.append("JAVA ");
		sb.append("Program Study");
		// append는 문자열 연산 (+) 과 같음
		System.out.println(sb.toString());
		// append는 문자열 뒤에 추가함

		sb.insert(4, "2");
		System.out.println(sb.toString());
		// insert는 4번째 위치에 문자 추가
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		// 4번째 위치에 문자로 교체

		sb.replace(6, 13, "BOOK");
		System.out.println(sb.toString());
		// 6~13위치에 BOOK으로 교체

		sb.delete(4, 5);
		System.out.println(sb.toString());
		// 4~5내용 삭제 (5는 미포함. // 2번째 인자는 미포함됨.)

		int length = sb.length();
		System.out.println("총문자수 : " + length);

		String result = sb.toString();
		System.out.println(sb.toString());
		// toString은 문자열로 변환

	}

}
