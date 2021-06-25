package 연습.thisjava;

public class AddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ainterface ai = ((a, b) -> {return a + b;});
		ai = ((a, b) -> a * b);
		
		
		int c = ai.add(5, 10);
		c = testLambda(5, 10, ((a, b) -> a + b));
		c = testLambda(5, 30, ((a, b) -> sum(a,b)));
		System.out.println(c);
	}

	private static int testLambda(int a, int b, Ainterface adder) {
		return adder.add(a, b);
	}

	static class Util{
		static Object sum(int a, int b) {
		return a + b;
		}
	}
}
