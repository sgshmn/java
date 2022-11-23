import java.util.Random;

public class Ex09 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int num = rd.nextInt(31231);
		
		System.out.println(num + "은 완전수일까요? >> " + isPerfect(num));
		System.out.println(num + "은 소수일까요? >> " + isPrime(num));
		
	}
	
	public static boolean isPerfect(int num) {
		
		return samePart(num) == num;
	}
	
	public static boolean isPrime(int num) {
		
		return samePart(num) == 1;
	}
	
	public static int samePart(int num) {
		
		int sum = 0;
		
		for (int i = 1; i <= (num / 2); i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	
	
}
