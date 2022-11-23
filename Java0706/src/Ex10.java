import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int num = rd.nextInt(2147483647);
		
		System.out.println(num + " << 소수냐?");
		System.out.println(isPrime(num));
		
	}
	
	
	public static boolean isPrime(int x) {
		
		int cnt = 0;
		for (int i = 1; i < x; i++) {
			
			if(x % i == 0) {
				cnt++;
			}
			if(cnt > 1) {
				break;
			}
				
			if (x < i * i) {
				return true;
				
			}
		}
		return false;
		
	}
}
