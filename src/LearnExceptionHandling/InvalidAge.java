package LearnExceptionHandling;

public class InvalidAge {
	public static void main(String[] args) throws InvalidAgeException {
		int age = 115;
		if (age < 18 || age > 100) {
			try {
				throw new InvalidAgeException("Hi the age is not valid");
			} catch (InvalidAgeException e) {
				System.out.println("Please enter valid date");
			}
		} else {
			System.out.println("welcome to vote");
		}
	}
}
