package Static;

public class Student {

	String name;
	static String teacher;
	
	public void print() {
		System.out.println(name);
	}
	public static void getTeacher() {
		System.out.println(teacher);
	}
}
