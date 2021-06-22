package CompComp;

import java.util.Arrays;

public class SortByHeight {
	public static void main(String[] args) {
		testSortByHeight();
	}
	private static void testSortByHeight() {
		Student[] class6_5 = {
				new Student("김", 145.9f, 39.0),
				new Student("이", 145.3f, 35.0),
				new Student("박", 160f, 32.0)
		};
		Arrays.sort(class6_5, new CompHeight());
		for (Student st : class6_5) {
			System.out.println(st);
		}
	}
}
