package LearnNonPrimitiveDataTypes;

public class Day1 {
	public static void main(String[] args) {
		// int a = 1, b = 2, c = 3, d = 4, e = 5;
		int[] myArr = { 6, 8, 6, 5, 8, 2, 1, 9 };
		// 0 1 2 3 4
//		System.out.println(myArr[2]);
//		System.out.println(myArr[4]);
		System.out.println("Array length is " + myArr.length);

		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
	}
}

// can I put duplicates - >  Yes
// can you increase length run time - > No
// Can you put different primitive data types -> No