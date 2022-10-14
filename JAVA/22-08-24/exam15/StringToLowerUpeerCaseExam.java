package exam15;

public class StringToLowerUpeerCaseExam {

	public static void main(String[] args) {
		String str1 = "Java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));//==> 대소문자 차이로 false
		
		String lowerStr1 = str1.toLowerCase();// Java Programing ==> java programing
		String lowerStr2 = str2.toLowerCase();// JAVA Programing ==> java programing
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		
		
		System.out.println(lowerStr1.equals(lowerStr2));//==> 둘다 소문자이므로 true
		
		System.out.println(str1.equalsIgnoreCase(str2));//==> equalsIgnoreCase는 대소문자 무시 비교
		
		String upperStr = str2.toUpperCase();
		System.out.println(upperStr);
	}
}
