
public class Ex12 {

	public static void main(String[] args) {
		
		int i;
		int j;
		int compare;
		
		for (i = 2; i < 2147483647; i++) {
			compare = 0;
			for (j = 1; j <= i/2; j++) {
				compare += i % j == 0 ? j : 0;	
			}
			if (i == compare) {
				System.out.println(i + "\t is PerfectNumber");
			}
						
		}
	}
}
