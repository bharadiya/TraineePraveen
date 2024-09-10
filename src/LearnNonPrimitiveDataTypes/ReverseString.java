package LearnNonPrimitiveDataTypes;

public class ReverseString {
	public static void main(String[] args) {
		String p = "Putin"; // Literal
		String rev = "";
		for (int i = p.length() - 1; i >= 0; i--) {
//			System.out.println(p.charAt(i));
			rev = rev + p.charAt(i);
		}
		System.out.println(rev);
	}

	/*
	 * This method returns boolean if passed value is palindrome , returns false if passed value is not a palindrome
	 * @String  
	 * @return  boolean 
	 */
	public static boolean isPalindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
//			System.out.println(p.charAt(i));
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}
}
