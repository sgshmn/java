import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] nums = new int[35];
		
		Random rd = new Random();
		
		int i;
		for(i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(100);
		}
		for (i = 0; i < nums.length ; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
		int max = nums[0];
		for (i = 1; i < nums.length; i++) {
			max = max > nums[i] ? max : nums[i];
		}
		System.out.println("위 배열에서 가장 큰 수 : " + max);
		
		int min = nums[0];
		for (i = 1; i < nums.length; i++) {
			min = min < nums[i] ? min : nums[i];
		}
		
		System.out.println("위 배열에서 가장 작은 수 : " + min);
		
	}
}
