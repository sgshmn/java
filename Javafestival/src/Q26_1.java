import java.util.Scanner;

public class Q26_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		int result = 1;
		
		for (int i = 0; i < num - 1; i++) {
			System.out.print(result + " ");
			result += i + 1;
		} 
		System.out.print(result);
		
	
	}
}
