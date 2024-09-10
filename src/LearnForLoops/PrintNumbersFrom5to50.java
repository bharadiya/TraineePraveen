package LearnForLoops;

public class PrintNumbersFrom5to50 {
	public static void main(String[] args) {
		for (int i = 5; i <= 100; i += 5) {
			if (i == 55) {
				break;
			}
			System.out.println(i);
		}
	}
}
