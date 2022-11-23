import java.util.Random;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		Random rd = new Random();
		
		int k = 100;
		
		int i;
		for (i = 0; i < nums.length - 1; i++) {
			nums[i] = rd.nextInt(k + 1);
			k -= nums[i];
		}
		nums[4] = k;
		
		int j;
		
		for (i = 0; i < nums.length; i++) {
			System.out.print((i + 1 )+ " (" + nums[i] + ") : ");
			
			for (j = 0; j < nums[i]; j++) {
				System.out.print("!");
			}
			System.out.println();
		}
	}
}
