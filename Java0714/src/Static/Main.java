package Static;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "강";
		Student s2 = new Student();
		s2.name = "이";
		
		s1.teacher = "원"; // static변수는  같은 클래스끼리 공유한다
		System.out.println(s2.teacher); // 노란줄 : static 메모리에 선언한 변수/메소드는 객체를 생성하지 않아도 접근이 가능하다
		
		Student.teacher = "원장";
		Student.getTeacher();
		
		
		System.out.println(); // 얘도 static 메소드

//		new Scanner(Systmem.in) 여기서 Systmem.in 얘도 static 메소드
		
		
		
		
	}
}
