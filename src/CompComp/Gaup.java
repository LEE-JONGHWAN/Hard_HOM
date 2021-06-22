package CompComp;

import java.util.Comparator;

public class Gaup implements Comparator<Restaurant> {

	@Override
	public int compare(Restaurant o1, Restaurant o2) {
		return o1.gethiDay().compareTo(o2.gethiDay());
	}
	
}

