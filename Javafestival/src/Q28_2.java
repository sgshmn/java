import java.util.Random;
import java.util.Scanner;

public class Q28_2 {

	public static void main(String[] args) {
		

		Random rd = new Random();
		int[] nums = new int[6];
		
		for (int i = 0; i<nums.length; i++) {
			nums[i] = rd.nextInt(45) + 1;
			for (int j = 0; j<i; j++) {
				if (nums[i] == nums[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("행운의 숫자 >> ");
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
}
