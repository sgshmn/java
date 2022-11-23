import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값 > ");
		int n = sc.nextInt();

		System.out.println("반올림 후 값 > " + (n + 5) / 10 * 10);

	}
}
