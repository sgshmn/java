
public class Ex09 {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		for (i = 4; 0 <= i ; i--) {
			for (j = 0; j < 5; j++) {
				System.out.print(j < i ? " " : "*");				
			}
			System.out.println();
		}
	}
}
