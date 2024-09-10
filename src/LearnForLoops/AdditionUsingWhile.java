package LearnForLoops;

public class AdditionUsingWhile {
	public static void main(String[] args) {
		int i = 1;
		int n = 5;
		int sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
