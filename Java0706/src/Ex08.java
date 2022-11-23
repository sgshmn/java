
public class Ex08 {

	public static void main(String[] args) {
		
		int num = 281712023;
		
		System.out.println(num + "은 소수인가요? >> " + isPrime(num));
	}
	
	public static boolean isPrime(int x) {
		int cnt = 0;
		int root = 0;
		
		for (int i = 0; i < x; i++) {
			if (x < i * i) {
				root = i;
				break;
			}
		}
		
		
		for (int i = 1; i < root; i++) {
			if (x % i == 0) {
				cnt++;
			}
		}
		return cnt == 1;
	}
}
