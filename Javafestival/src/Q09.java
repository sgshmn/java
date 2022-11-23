
public class Q09 {

	public static void main(String[] args) {
		
		int n1 = 12;
		int n2 = 3;
		
		boolean result = isDivide(n1, n2);
		
		System.out.println("결과 >> " + result);
	}
	
	public static boolean isDivide(int n1, int n2) {
		
		return n1 % n2 == 0;
	}
}
