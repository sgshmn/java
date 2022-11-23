import java.util.Scanner;

public class Q05_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자1입력>> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2입력>> ");
		int num2 = sc.nextInt();

		int temp1 = num1;
		int temp2 = num2;
		int temp3;

		int gcd;
		int lcm;

		while (true) {
			temp3 = temp1 % temp2;

			if (temp3 == 0) {
				gcd = temp2;
				break;
			}

			temp1 = temp2;
			temp2 = temp3;

		}
		lcm = num1 * num2 / gcd;

		System.out.println("최대공약수 >> " + gcd);
		System.out.println("최소공배수 >> " + lcm);

	}
}
