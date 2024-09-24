package LearnExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("nonexistent_file.txt");
		Scanner scanner = new Scanner(file);
	}
}
