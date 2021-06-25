package CompComp;

import java.util.Comparator;

public class CompHeight implements Comparator<Student>  {
		@Override
		public int compare(Student o1, Student o2) {
			return Float.compare(o1.height, o2.height); // 개선 형태
		}
	}