import java.util.Scanner;

public class Ex03_학점 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		char grade = 'D';
		
		switch (score/10) {
		
		case 10:
			grade = 'A';
			break;				// 여기서 break가 없다면 어떻게 될까? break를 만날 때 까지 한 줄씩 실행한다.
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			break;
		}
		
		System.out.println(grade + "학점입니다!");
	}
}