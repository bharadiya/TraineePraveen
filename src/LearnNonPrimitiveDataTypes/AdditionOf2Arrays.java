package LearnNonPrimitiveDataTypes;

public class AdditionOf2Arrays {
	public static void main(String[] args) {
		int[] myArr1 = { 6, 8, 6, 5, 8, 2, 1, 9 };
		int[] myArr2 = { 1, 1, 1, 1, 1, 1, 1, 1 };
		int[] sum = new int[8];
		for (int i = 0; i < myArr1.length; i++) {
			sum[i] = myArr1[i] + myArr2[i];
		}
		for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}
	}
}

// can I put duplicates - >  Yes
// can you increase length run time - > No
// Can you put different primitive data types -> No