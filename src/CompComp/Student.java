package CompComp;

public class Student {
	String name;
	Float height;
	Double weight;
	public Student (String name, Float height, Double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "이름: " + name + "  키: " + height;
	}
}
