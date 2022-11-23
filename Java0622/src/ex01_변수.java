public class ex01_변수 {
	// main class : main method가 있는 클래스
	// 프로젝트에 한개 이상은 설계해야한다.
	// 프로그램 시작하는 클래스
	
	public static void main(String[] args) {
		// 정수형 데이터 num1 변수 선언
		int num1; // 변수 선언
		// String num1; 동일한 이름의 변수는 여러번 선언할 수 없다.
		num1 = 14; // 초기화 : 변수 선언 후 값을 처음으로 넣는 것
		System.out.println(num1);
		num1 = 31;
		System.out.println(num1);
		
		// 상수
		// 변하지 않는 수
		// 데이터를 담는 공간
		// final 키워드를 사용한다. 
		final int num2; // 상수 선언
		num2 = 3; // 초기화
		System.out.println(num2);
//		num2 = 5; 에러 발생한다. final 키워드를 삭제해야 에러를 수정할 수 있다.
		
//		String int; 키워드는 변수나 상수의 이름으로 쓸 수 없다. 
		
	}
}
