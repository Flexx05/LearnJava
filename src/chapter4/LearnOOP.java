package chapter4;

public class LearnOOP {

	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		LearnOOP test = new LearnOOP();
		int sum = test.sum(23, 33);

		System.out.printf("Check sum: %d", sum);
	}
}
