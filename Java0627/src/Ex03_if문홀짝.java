import java.util.Scanner;

public class Ex03_if문홀짝 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();

		if (x % 2 != 0) {
			System.out.println(x + "는(은) 홀수입니다.");
		} else {
			System.out.println(x + "는(은) 짝수입니다.");
		}
		// Ctrl Shift F 자동 들여쓰기

	}
}
