
public class Q12 {

	public static void main(String[] args) {
		
		int k = 1;
		int s = 0;
		for (int i = 1; i <= 100; i++, k *= -1) {
			
			s += i*k;
			if (i == 1) {
				System.out.print(i);
			} else if (k > 0) {
				System.out.print("+" + i);
			} else {
				System.out.print(i*k);
			}
		}
		System.out.println();
		System.out.println("= " + s);
	}
}
