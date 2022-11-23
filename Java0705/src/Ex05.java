
public class Ex05 {

	public static void main(String[] args) {

		int[] sharpCount = { 3, 4, 4, 2, 1 };

		int i = 0;
		int j = 0;

		for (i = 0; i < sharpCount.length; i++) {
			System.out.print(sharpCount[i] + " : ");
			for (j = 0; j < sharpCount[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
