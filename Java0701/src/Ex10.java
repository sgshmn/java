
public class Ex10 {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		for (i = 0; i < 6; i++) {
			for (j = -6; j < 6; j++) {
				
				System.out.print((j < -i || i < j) ? " " : "*");
				
			}
			System.out.println();
		}
	}
}
