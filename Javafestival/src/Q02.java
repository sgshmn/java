import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 >> ");
		int year = sc.nextInt();
		
		if (year % 400 == 0) {
			System.out.println("윤년");
		} else if (year % 100 == 0){
			System.out.println("윤년 아님");
		} else if (year % 4 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년 아님");
		}
	}
}
