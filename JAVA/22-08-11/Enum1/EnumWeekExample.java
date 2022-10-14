package Exam_04.Enum1;

import java.util.Calendar;

import Exam_04.Human03Enum.Week;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println (week);
		
		switch (week) {
		case 1 :
			today = Week.SUN;
			break;
		case 2 :
			today = Week.MON;
			break;
		case 3 :
			today = Week.THE;
			break;
		case 4 :
			today = Week.WED;
			break;
		case 5 :
			today = Week.THU;
			break;
		case 6 :
			today = Week.FRI;
			break;
		case 7 :
			today = Week.SAT;
			break;
		}
		System.out.println ("today : " + today );
		System.out.println ("today : " + today.name() );
		System.out.println ("today : " + today.ordinal() );
		
		
		Week day1 = Week.MON;	// day1 = 월 (2)
		Week day2 = Week.THU;	// day2 = 목 (5)
		
		System.out.println ("day1.compareTo(day2) : " + day1.compareTo(day2));
		System.out.println ("day2.compareTo(day1) : " + day2.compareTo(day1));
		System.out.println ("day1.compareTo(day1) : " + day1.compareTo(day1));
		
	}

}
