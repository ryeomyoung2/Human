package exam01;

import java.util.ArrayList;
import java.util.List;

public class Human {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		// List는 인터페이스 = ArrayList는 구현클래스.
		list1.add("HUMAN1");
		list1.add("HUMAN2");
		list1.add(10);
		
//		System.out.println(list1.get(0));
		
		String str1 = (String) list1.get(0);
		// list1.get(0)는 Object 타입.
		// Object는 상위, String은 하위 ==> 상위에서 하위로 변환할 때는 강제타입변환 필요.
		// 1. 강제 타입의 변환이 꼭 필요함
		// 2. String을 Object 클래스로 변환
		
		System.out.println(str1);
		
		int intStr = (int) list1.get(2);  // 정수인 10을 가져올 수 있음.
		System.out.println(intStr);

		
		
		// 처음부터 String만 담겠다고 규정하면 강제타입변환이 필요없음.
		
		List<String> list2 = new ArrayList<String>();
		// <String>만 담겠다란 정의. 이는 제네릭 문법이라 함.
		// list2에는 String만 담길수 있으며, 다른 것은 에러 처리 (사전에 에러체크 가능)
		list2.add("HUMAN1");
		list2.add("HUMAN2");
		list2.add("HUMAN3");
		
		String str2 = list2.get(2);	// 강제타입변환이 없어도 에러 없음.

		System.out.println(str2);


	}

}
