package LearnNonPrimitiveDataTypes;

public class MultidimensionalArray {
	public static void main(String[] args) {
		int[][] arr = { { 0, 6 }, { 4, 3, 5, 6 }, { 1 } };
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Bigger array length is" + arr.length);
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println("Internal array length is " + arr[i].length);
//				System.out.println(arr[i][j]);
//			}
//		}
		System.out.println(arr[1][3]);
	}
}