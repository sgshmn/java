
public class Ex11 {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		for (i = 2; i <= 12; i++) {
			System.out.print(i + "의 약수 : ");
			for (j = 1; j <= i; j ++) {
				System.out.print(i % j == 0 ? j + " " : "");
			}
			System.out.println();
		}
	}
}
