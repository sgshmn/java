import java.util.Scanner;

public class Ex01_실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Ctrl + Shift + O 알아서 import 하기.
												// 처음에 자동완성 했다면 상관 없지만 써보는 것도 괜찮다.
		int inputInt;

		while (true) {			
			System.out.print("10 이하의 정수를 입력하세요 : ");
			inputInt = sc.nextInt();
			if (10 < inputInt) {
				System.out.println("10보다 큽니다");
				break;
			}
		}
		System.out.println(inputInt);

	}

}
