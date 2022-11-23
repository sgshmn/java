import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("dan : ");
		int eks = sc.nextInt();
		
		int i;
		
		for (i = 1; i < 10; i++) {
			System.out.println(eks + "*" + i + "=" + eks*i);
		}
	}
}
