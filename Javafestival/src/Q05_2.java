import java.util.Scanner;

public class Q05_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1입력>> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2입력>> ");
		int num2 = sc.nextInt();
		
		int result1;
		int result2;
		
		
		int i = 1;
		while (true) {
			if (i * num1 % num2 == 0) {
				result1 = i * num1;
				break;
			}
			i++;
		}
		result2 = num1 * num2 / result1;
		
		System.out.println("최대공약수:" + result2);
		System.out.println("최소공배수:" + result1);
		
		
		
	}
}
