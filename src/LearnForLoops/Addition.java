package LearnForLoops;

public class Addition {
	// print addition from 1 to 10
	public static void main(String[] args) {

		int mul = 1;
		for (int i = 1; i <= 8; i++) {
			mul *= i; // sum += i
			System.out.println(mul);
		}
		System.out.println(mul);
	}
}
