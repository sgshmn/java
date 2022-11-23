import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("소인수 분해할 수를 입력하세요 >> ");
		int num = sc.nextInt();
		
		System.out.print(num + " = ");
		int div = 2;
		while (true) {
			if (num % div == 0) {

				System.out.print(div);
				num /= div;
				
				if (num == 1) {
					break;
				}	
				
				System.out.print("*");

			} else {
				div++;
			}

		}
	}
}
