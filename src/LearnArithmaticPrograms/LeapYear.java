package LearnArithmaticPrograms;

public class LeapYear {
	public static void main(String[] args) {
		int year = 2015;
		System.out.println(isLeapYearMethod(year));
	}

	static boolean isLeapYearMethod(int year) {
		boolean isLeapYear = false;
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				isLeapYear = true;
			}
		} else {
			if (year % 4 == 0) {
				isLeapYear = true;
			}
		}
		return isLeapYear;
	}
}

// Method is reusable thing - if lets say tomorrow some guy from your team wants to use the code then he can just call your method
// 
