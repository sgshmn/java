import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] nums = new int[10];
		int i = 0;
		
		for (i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(20) + 1;
			
			System.out.print(nums[i] + " ");
			
		}
		int oddCnt = 0;
		
		System.out.print("array에 들어있는 홀수는 ");
		for (i = 0; i < nums.length; i++) {
			if (nums[i]%2 == 1) {
				System.out.print(nums[i] + " ");
				oddCnt++;
			}
		}
		System.out.println("이며, 총 " + oddCnt + "개 입니다");
		
	}
}
