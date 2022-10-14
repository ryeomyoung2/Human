package Exercise_01;

public class StudentExam {

	public static void main(String[] args) {
		Student s0 = new Student();
		Student s1 = new Student("강현준", 1,1,100,60,76);
		
		int total = s1.getTotal();
		double avg = s1.getAvg();
		
		System.out.printf("total : %d \t avg : %.1f \n", total, avg);
		
		System.out.println (Math.sqrt(4));
	}

}
