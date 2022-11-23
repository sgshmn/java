import java.util.Scanner;

public class Ex04_계절 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		String season = "겨울";
		
		switch (month/3) {
		case 1:
			season = "봄";
			break;
		case 2:
			season = "여름";
			break;
		case 3:
			season = "가을";
			break;
		default:
			break;
		}
		
		System.out.println(month + "월은 " + season + "입니다.");
	}
}
