package LearnArithmaticPrograms;

public class DoAdditionOfDigits {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int additionofNum = addition(a, b);
		System.out.println(additionofNum);
		System.out.println(areEqual(a, b));
	}

	public static int addition(int x, int y) {
		return x + y;
	}

	public static int addition(int x, int y, int z) {
		return x + y + z;
	}

	public static int addition() {
		int p = 1;
		return p + 1 + 3;
	}

	public static float addition(float a, float b) {
		return a + b;
	}

	public static double addition(float b, double a) {
		return a + b;
	}

	public static boolean areEqual(int a, int b) {
		boolean f = a == b;
		return f;
	}

	public static boolean areEqual(int a, int b, int c) {
		boolean f = a == b && b == c;
		return f;
	}
}
