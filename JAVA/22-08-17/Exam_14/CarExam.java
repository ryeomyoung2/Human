package Exam_14;

//import Exam_12.*;
//import Exam_12.test.*;		


public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car("2022-10000", "그랜져");		
		System.out.println ("company : " + car1.company);
		System.out.println ("carId : " + car1.carId);
		System.out.println ("model : " + car1.model);
		car1.setCompany("기아");
		System.out.println ("company : " + car1.company);
	}

}
