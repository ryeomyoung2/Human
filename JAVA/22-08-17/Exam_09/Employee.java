package Exam_09;

public class Employee {

	public int employeeId;
	public static int serialNum = 1000; 
	
	public Employee() {
		serialNum++;
		this.employeeId = serialNum;
	}

}
