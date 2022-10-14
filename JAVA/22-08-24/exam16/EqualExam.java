package exam16;

import java.util.Arrays;

public class EqualExam {

	public static void main(String[] args) {
		int[][] origin = {{1,2},{3,4}};
		
		System.out.println("앝은복제 후 비교");
		int[][] cloned1 = Arrays.copyOf(origin, origin.length);
		System.out.println("배열번지비교 : " + origin.equals(cloned1));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(origin, cloned1));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(origin, cloned1));
		System.out.println("--------------------");
		System.out.println("깊은복제 후 비교");
		int[][] cloned2 = Arrays.copyOf(origin, origin.length);
		cloned2[0] = Arrays.copyOf(origin[0], origin[0].length);
		cloned2[1] = Arrays.copyOf(origin[1], origin[1].length);
		System.out.println("배열번지비교 : " + origin.equals(cloned2));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(origin, cloned2));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(origin, cloned2));
	}

}
