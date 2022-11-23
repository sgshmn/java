import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n > ");
		int n = sc.nextInt();
		
		int[][] ns = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0 ; j < n; j++) {
				ns[i][j] = i + n*j + 1;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0 ; j < n; j++) {
				System.out.print(ns[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
