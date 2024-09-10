package LearnNonPrimitiveDataTypes;

public class LearnString {
	public static void main(String[] args) {
		String p = "Praveen"; // Literal
		String a = new String("praveen"); // new keyword
		
		char firstChar = p.charAt(4);
		System.out.println(firstChar);
		
		System.out.println(p.equalsIgnoreCase(a));
		
		System.out.println(p.codePointAt(3));
	}
}
