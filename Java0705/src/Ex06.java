import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] nums = new int[100];
		
		Random rd = new Random();
		
		int i;
		
		for (i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(5) + 1;
		}
		int numberCnt = 0;
		int j;
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < nums.length; j++) {
				if (nums[j] == i + 1) {
					numberCnt++;
				}
			}
			System.out.print((i + 1 )+ " (" + numberCnt + ") : ");
			for (j = 0; j < numberCnt; j++) {
				System.out.print("!");
			}
			System.out.println();
			numberCnt = 0;
		}
	}
}
