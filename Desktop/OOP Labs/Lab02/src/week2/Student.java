package week2;
public class Student {
	private String StudentName;
	private int StudentId;
	private int StudentYears;
	public Student(String name, int id, int years) {
		this.StudentName = name;
		this.StudentId = id;
		this.StudentYears =years;
	}
	public void Details() {
		System.out.println("Name: " + StudentName);
		System.out.println("Id: " + StudentId);
		System.out.println("Year of Study: " + StudentYears);
	}
	public void increment() {
		StudentId += 1;
	}
	public static void main(String[] args) {
		Student student = new Student("Akbota", 2, 2024);
		student.Details();
		student.increment();
		student.Details();
	}
}
