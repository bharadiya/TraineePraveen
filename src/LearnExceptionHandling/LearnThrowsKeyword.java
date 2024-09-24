package LearnExceptionHandling;

public class LearnThrowsKeyword {
	public static void main(String[] args) throws Exception {
		m1();
	}

	public static void m1() throws Exception {
		m2();
	}

	public static void m2() throws Exception {
		m3();
	}

	public static void m3() throws Exception {
		m4();
	}

	public static void m4() throws Exception {
		m5();
	}

	public static void m5() throws ArithmeticException, Exception, ArrayIndexOutOfBoundsException {
		int[] a = { 1, 2, 3, 5, 6, 8, 9, 0 };
		// System.out.println(a[1000]);
		throw new Exception();
	}
}
