package 연습.LambDaLambDa;

import java.util.Arrays;

public class WordSortLam {

	public static void main(String[] args) {
		String[] topics = { "hate", "lov", "abba", "bodys", "good" };

		Arrays.sort(topics, 
				(first, second) -> {
					if (first.length() == second.length()) {
						return first.compareTo(second);
					} else {
						return first.length() - second.length();
					}
				});
		System.out.println(Arrays.toString(topics));
	}

}
