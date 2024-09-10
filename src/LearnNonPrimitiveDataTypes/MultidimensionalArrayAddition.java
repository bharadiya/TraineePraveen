package LearnNonPrimitiveDataTypes;

public class MultidimensionalArrayAddition {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 9, 7 } };
		int[][] arr2 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int [][] sum = new int [3][3];
				  //		0 1 2       0 1 2        0  1  2
							// 0		 1				 2
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.println(sum[i][j]);
			}
		}

	}
}