import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피보나치 수열의 몇 번째 항을 드릴까요?");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo(i) + " ");
		}
		System.out.println("못 믿으실까봐....");
		
	}
	
	public static int fibo(int n) {
		
		if (n < 3) {
			return 1;
		}
		return fibo(n-2) + fibo(n-1);
		
//		int x1 = 1;
//		int x2 = 1;
//		int x3 = 0;		
//		
//		if (num < 3) {
//			return 1;
//		} else {
//			for (int i = 2; i < num; i++) {
//				x3 = x1 + x2;
//				x1 = x2;
//				x2 = x3;			
//			}			
//		}
//		return x3;
	}
	
	
	
}
