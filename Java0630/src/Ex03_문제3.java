import java.util.Random;
import java.util.Scanner;

public class Ex03_문제3 {

	public static void main(String[] args) {

		// 1. 도구 준비
		Random random = new Random();
		Scanner sc = new Scanner(System.in);


		
		int randomNumber1;
		int randomNumber2;

		int failCount = 0;
		int inputAnswer = 0;

		while (failCount < 3) {

			randomNumber1 = random.nextInt(998) + 1;
			randomNumber2 = random.nextInt(998) + 1;

			System.out.print(randomNumber1 + " + " + randomNumber2 + " = ");
			inputAnswer = sc.nextInt();

			if (inputAnswer == randomNumber1 + randomNumber2) {
				System.out.println("정답!");
			} else {
				failCount++;
				switch (failCount) {

				case 1:
					System.out.println("다시 생각해보세요!");
					break;

				case 2:
					System.out.println("에잉...");
					break;

				case 3:
					System.out.println("조금더 공부하세요!");
					break;
				}

			}

		}
		System.out.println("Game Over!");

	}
}
