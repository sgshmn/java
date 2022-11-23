import java.util.Scanner;

public class Ex05_문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("구매 갯수");
		int x = sc.nextInt();

		if (x < 11) {
			x *= 10000;
		} else {
			x *= 9000;
		}
		System.out.println("가격은 " + x + "원 입니다.");
	}
}
