import java.util.Scanner;

public class Q18_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < num; i ++) {
			sum += i + 1;
		}
		
		System.out.println("1부터 " + num + "까지 다 더하면 " + sum+ "입니다");
	} 
}
