package LearnMethods;

public class AdditionProgram {
	public static void main(String[] args) {
//		doAddition();
		doAdditionWithParam(92);
		float getAddition = doAdditionWithParamAndReturnSum(25);
		System.out.println(getAddition);
	}

	public static void doAddition() {
		int i = 1;
		int n = 5;
		int sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	public static void doAdditionWithParam(int n) {
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	public static int doAdditionWithParamAndReturnSum(int n) {
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		return sum;
	}
}

//<Access modifier><static or non > < return data type> <name of the method>(){
//	
//}