package Exercise_01;

public class Student {
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	
	public Student() {
		this("강현준", 1,1,100,60,76);
		
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}

	public double getAvg() {
		return this.getTotal() / 3.;		// 정수/정수 ==> 정수인데.  둘중하나 실수이면 ==> 실수로 나옴.
	}
	
}
