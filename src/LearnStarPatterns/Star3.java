package LearnStarPatterns;

public class Star3 {
	public static void main(String[] args) {
		int lines = 25;
		int numberOfStars = 0;
		for (int i = 1; i <= lines; i++) {
			numberOfStars = lines - i+1;
			for (int j = 1; j <= numberOfStars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	
//		i numberofStars
//*****  1 - 5
//****   2 - 4
//***    3-  3
//**     4 - 2
//*      5 - 1