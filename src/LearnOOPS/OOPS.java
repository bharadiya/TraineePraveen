package LearnOOPS;

class Student {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printStudentInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}

class Pen {
	String color;

	public void printColor() {
		System.out.println(this.color);
	}
}

public class OOPS {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		Student s = new Student("Sanjay", 25);
		s.printStudentInfo();

//		s.printStudentInfo();
//		Student praveen = new Student();
//		praveen.name = "praveen";
//		praveen.age = 50;
//		praveen.printStudentInfo();
//
//		Pen redColor = new Pen();
//		redColor.color = "Red";
//		redColor.printColor();
//		Object[] arr = { 1, 2.5f, 2.5678, true, 'e', "Hi I am learning Java", a, s, praveen, redColor };
	}
}
