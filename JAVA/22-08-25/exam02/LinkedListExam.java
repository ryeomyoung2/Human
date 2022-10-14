package exam02;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
//		LinkedList<String> list = new LinkedList<String>();

		List<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = (LinkedList) list1 ;

		list2.add("Data1");
		System.out.println(list2);
		
		list2.add(1, "Data2");
		System.out.println(list2);

		list2.add(0, "Data3");
		System.out.println(list2);
		
		list2.addFirst("Data4");
		// list.add(0, "Data4");와 같은 것.
		System.out.println(list2);

		list2.addLast("Data5");
		// list.add(list.size(), "Data5"); 와 같음
		System.out.println(list2);
		
		System.out.println(list2.get(0));
	}
}
