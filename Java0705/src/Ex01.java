import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] nums = new int[10];
		int i = 0;
		int sum = 0;
		
		for (i = 0; i < nums.length; i++) {
			
			nums[i] = random.nextInt(20) + 1;
			System.out.print(nums[i] + " ");
			sum += nums[i];	
		}

		
		System.out.println();
		System.out.println("nums[4] + nums [9] = " + nums[4] + " + " + nums[9] + " = " + (nums[4] + nums[9]));
		System.out.println("sum = " + sum);
		
		double avg = (double)sum / nums.length;
		
		System.out.printf("average = %.2f" , avg);
		
		
	
		
	}
}
