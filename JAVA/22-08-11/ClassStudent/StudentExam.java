package Exam_04.ClassStudent;

public class StudentExam {
	public static void main(String[] args) {
		Student s1 = new Student();			//s1이란 학생을 생성함.
		s1.name = "A군";						// 각각의 멤버변수에 등록함.
		s1.kor = 100;
		s1.math = 90;
		s1.eng = 30;
		
		Student s2 = new Student();
		s2.name = "B양";
		s2.kor = 90;
		s2.math = 80;
		s2.eng = 70;
		
		System.out.println ("s1 : " + s1);
		System.out.println ("s2 : " + s2);

		System.out.printf ("s1.name : %s \n", s1.name);
		System.out.printf ("s2.math : %d \n", s2.math);
		
		Student s3 = new Student();
		s3.name = "C양";
		s3.kor = 100;
		s3.math = 20;
		s3.eng = 100;

		Student s4 = new Student();
		s4.name = "D군";
		s4.kor = 90;
		s4.math = 90;
		s4.eng = 90;

		Student s5 = new Student();
		s5.name = "E군";
		s5.kor = 40;
		s5.math = 30;
		s5.eng = 20;
	
		System.out.printf ("s1.name : %s \n", s1.name);
		System.out.printf ("s2.math : %d \n", s2.math);
		System.out.printf ("s3.eng : %d \n", s3.eng);
		
	}

}
