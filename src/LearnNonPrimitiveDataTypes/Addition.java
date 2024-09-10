package LearnNonPrimitiveDataTypes;

public class Addition {
	public static void main(String[] args) {
		int[] myArr = { 6, 8, 6, 5, 8, 2, 1, 9 };
		int sum = 0;
		for (int i = 0; i < myArr.length; i++) {
			sum += myArr[i];
		}
		System.out.println(sum);
	}
}

// can I put duplicates - >  Yes
// can you increase length run time - > No
// Can you put different primitive data types -> No