import java.util.ArrayList;
import java.util.Random;

public class Q28_1 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int x;
		for (int i = 0; i < 45; i++) {
			nums.add(i + 1);
		}
		
		for (int i = 0; i < 6; i++) {
			x = rd.nextInt(nums.size());
			System.out.println("행운의 숫자 >> " + nums.get(x));
			nums.remove(x);
		}
		
		
		
	}
}
