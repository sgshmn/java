import java.util.ArrayList;
import java.util.Scanner;

public class Q29_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> bin = new ArrayList<Integer>();
		
		System.out.println("???");
		int deci = sc.nextInt();
		
		while (deci > 0) {
			
			bin.add(deci % 2);
			deci /= 2;
			
		}
		
		for (int i = bin.size() - 1; i >= 0; i--) {
			System.out.print(bin.get(i) + " ");
		}
	}
}
