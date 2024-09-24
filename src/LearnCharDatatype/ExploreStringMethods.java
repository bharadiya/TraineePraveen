package LearnCharDatatype;

public class ExploreStringMethods {
	public static void main(String[] args) {
		String s = new String("praveen");
		int a = s.codePointAt(0);
		System.out.println(a);
		System.out.println(s.toUpperCase());

		String t = "This is my Java class I am doing good";
		String[] arr = t.split(" ");		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
