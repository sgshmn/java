import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수 내놔");
		int num = sc.nextInt();
		
		System.out.println("이게 " + num + "의 약수야");
		
		int i;
		for (i = 1; i <= num; i++) {
			
			System.out.print(num % i != 0 ? "" : i + " " );  
			
		}
	}
}
