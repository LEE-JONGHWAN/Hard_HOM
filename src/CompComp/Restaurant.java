package CompComp;

import java.time.*;
import java.util.Arrays;
import java.util.Comparator;

class ABC implements Comparator<Restaurant>{

	@Override
	public int compare(Restaurant o1, Restaurant o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class 개업역순 implements Comparator<Restaurant>{

	@Override
	public int compare(Restaurant o1, Restaurant o2) {
		return o2.gethiDay().compareTo(o1.gethiDay());
	}
}

public class Restaurant implements Comparable<Restaurant> {
	private float custEval;
	private String name;
	private LocalDate hiday;

	
	public LocalDate gethiDay() {
		return hiday;
	}

	public void sethiDay(LocalDate hiday) {
		this.hiday = hiday;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Restaurant(float custEval, String name, LocalDate hiday) {
		super();
		this.custEval = custEval;
		this.name = name;
		this.hiday = hiday;
	}


	public float getCustEval() {
		return custEval;
	}

	public void setCustEval(float custEval) {
		this.custEval = custEval;
	}
	@Override
	public String toString() {
		return " 개업:" + hiday + ", 식당:" + name + "평점" + custEval;
	}

	public static void main(String[] args) {
		var 근처식당 = new Restaurant[3];
		근처식당[0] = new Restaurant(3.4f, "행복식당",LocalDate.of(2019,2,3));
		근처식당[1] = new Restaurant(4.9f, "로링식당",LocalDate.of(2019,3,3));
		근처식당[2] = new Restaurant(4.3f, "냠냠식당",LocalDate.of(2019,5,3));
		
		Arrays.sort(근처식당);
		System.out.println(Arrays.toString(근처식당));
		
		Arrays.sort(근처식당, new ABC());
		System.out.println(Arrays.toString(근처식당));

		Arrays.sort(근처식당, new Gaup());
		System.out.println(Arrays.toString(근처식당));

		Arrays.sort(근처식당, new 개업역순());
		System.out.println(Arrays.toString(근처식당));
	}
	
	//@formatter:off
	@Override
	public int compareTo(Restaurant o) {
		return Float.compare(o.getCustEval(),
							this.getCustEval());
	}
	//@formatter:on
}
