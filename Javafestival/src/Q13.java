import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n > ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i ++) {
			System.out.print(i + " : ");
			for (int j = 1; j <= i/2; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
				
			}
			System.out.print(i);
			System.out.println();
		}
	}
}
