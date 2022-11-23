import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 줘 >> ");
		int num = sc.nextInt();
		
		int[][] squares = new int[num][num];
		int k = 1;
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < num; j++) {
					squares[i][j] = i*num + j + 1;
				}
			} else {
				for (int j = 0; j < num; j++) {
					squares[i][j] = i*num - j + num;
				}
			}
		}
		
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(squares[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
