import java.util.Scanner;

public class Q18_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		int num = sc.nextInt();
		
		int sum = num * (num + 1) / 2;
		
		System.out.println("1부터 " + num + "까지의 합은 " + sum+ "입니다");
	}
}
