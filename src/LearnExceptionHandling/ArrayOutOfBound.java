package LearnExceptionHandling;

public class ArrayOutOfBound {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 8, 9, 0 };
		try {
			System.out.println(a[1000]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Indexing given by you is incorrect.");
		} catch (Exception e) {
			System.out.println("Please change the file and try again");
		} finally {
			System.out.println("exception handled successfully");
		}
	}
}

//- only try block won't work , you need to apply try with either catch or finally
//- try block - if you are using finally - code will execute in any condition , exception found or not found - but if exception is found - exception won't be handled
//- try block - you can have as many as catch block you want
//- can you start your code with catch block - NO
//- finally will always run doesn't matter if your code is throwing exception , finally can be used only once
// - can you nested try catch - YES