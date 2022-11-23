import java.util.Random;

public class Ex00 {

	public static void main(String[] args) {

		// 1~10 랜덤으로 겹치지 않게 뽑기
		Random rd = new Random();

		int[] nums = new int[10];

		int i = 0;
		int j = 0;

		for (i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(10) + 1;
			for (j = 0; j < i; j++) {
				if (nums[i] == nums[j]) {
					i--;
					break;
				}
			}
		}

		for (i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}
}