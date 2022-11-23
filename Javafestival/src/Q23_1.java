import java.util.Scanner;

public class Q23_1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >> ");
		int num = sc.nextInt();
		
		System.out.print("출력 >> "+ fact(num));
		
	}
	
	public static int fact(int num) {
		
		return num != 1 ? num*fact(num - 1) : 1;
	}
	
}
