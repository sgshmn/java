import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 금액 > ");
		int my = sc.nextInt();
		System.out.println("잔돈반환");
		
		System.out.println("10000원 : " + (my / 10000) + "개");
		System.out.println("5000원 : " + (my % 10000 / 5000) + "개");
		System.out.println("1000원 : " + (my % 5000 / 1000) + "개");
		System.out.println("500원 : " + (my % 1000 / 500) + "개");
		System.out.println("100원 : " + (my % 500 / 100) + "개");
	}
}
