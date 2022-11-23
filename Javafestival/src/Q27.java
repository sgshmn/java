import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print((i + 1) + "번째 입력 : ");
			nums[i] = sc.nextInt();
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " : ");
			for (int j = 0; j < nums[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
