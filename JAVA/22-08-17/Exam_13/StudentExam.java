package Exam_13;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = Student.getInstance();		// Student Class에서 생성된 s 반환
		Student s2 = Student.getInstance();		// Student Class에서 생성된 s 반환
		
		System.out.println (s1);
		System.out.println (s2);
		
//		Student s3 = new Student();		
		// Student의 생성자가 private이기 때문에 에러 발생
	}

}
