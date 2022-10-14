package Exam_04.ClassStudent;

public class Student {
	// 멤버변수..
	public String name;			// 이름
	public int kor;				// 국어점수
	public int math;			// 수학점수
	public int eng;				// 영어점수
	
	// 생성자.. 
	public Student() {			//  생성자
		name = "강현준";
		kor = 80;
		math = 80;
		eng = 90;
	}

	public  Student(String string, int i, int j, int k) {
		name = string;
		kor = i; 
		math = j;
		eng = k;
	}
	
	
//메서드... 
}
