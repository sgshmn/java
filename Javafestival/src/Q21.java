import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 줘 >> ");
		int num = sc.nextInt();
		
		System.out.print(num + "의 약수는 >> ");
		
		for (int i = 1; i <= num/2; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.print(num);
	}
}
