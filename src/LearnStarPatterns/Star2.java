package LearnStarPatterns;

public class Star2 {
	public static void main(String[] args) {
		int lines = 19;
		int numberOfStars = 0;
		for (int i = 1; i <= lines; i++) {
			numberOfStars = i;
			for (int j = 1; j <= numberOfStars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//*
//**
//***
