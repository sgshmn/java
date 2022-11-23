import java.util.Scanner;

public class Ex06_elseif문 {

	public static void main(String[] args) {

//		if (조건식1) {
//			
//		} else if (조건식2) {
//			
//		} else if (조건식3) {
//			
//		} else {   else가 있으면 반드시 한번은 실행된다. 
//	
//		}

		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		char grade = 'X'; // else로 끝나지 않으면 초기화를 해줘야한다. else가 없을 때 컴퓨터는 모든 경우의 수 고려여부를 알지 못 한다. 
		
		if (score < 70) {
			grade = 'F';
		} else if (score < 80) {
			grade = 'C';
		} else if (score < 90) {
			grade = 'B';
		} else if (score <= 100) {
			grade = 'A';
		}
		System.out.println(grade + "학점입니다.");
	}
}
