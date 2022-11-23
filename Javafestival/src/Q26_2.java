import java.util.Scanner;

public class Q26_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print(hs(i + 1) + " ");
		}
		
		
	}

	public static int hs(int num) {

		if (num == 1) {
			
			return 1;
		}
		return num - 1 + hs(num-1) ;
		
	}
	
	
	
	
	

}
