
public class Ex07 {

	public static void main(String[] args) {
		
		
		int a = 33550336;
		
		System.out.println(a + "는 완전수인가요? >> " + isPerfect(a));
		
	}
	
	
	public static boolean isPerfect(int num) {
		
		int sum = 0;
		
		for (int i = 1; i <= (num / 2); i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
		
		
	}
}
