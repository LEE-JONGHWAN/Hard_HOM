package 연습.LambDaLambDa;

import java.util.Arrays;
import java.util.Comparator;

class SorterByLen implements Comparator<String>{

	@Override
	public int compare(String first, String second) {
		if (first.length() == second.length()) {
			return -1*first.compareTo(second);
		} else {
	return -(first.length() - second.length());
		}
	}
}

public class WordSortObj {

	public static void main(String...args) {
		String[] topics = { "hate", "lov", "abba", "bodys", "good" };
		Arrays.sort(topics, 
				new SorterByLen());
		System.out.println(Arrays.toString(topics));
	}

}
