import java.util.Random;

public class Q03 {

	public static void main(String[] args) {

		int[] nums = new int[8];
		Random rd = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(99) + 1;
		}
		
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		int big, small;
		big = small = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			
			if (big < nums[i]) {
				big = nums[i];
			}

			if (small > nums[i]) {
				small = nums[i];
			}
		}

		System.out.println("가장 큰 값 : " + big);
		System.out.println("가장 작은 값 : " + small);

	}
}
