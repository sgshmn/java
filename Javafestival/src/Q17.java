import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품 개수 입력 > ");
		int n = sc.nextInt();
		int p;
		if (n > 10) {
			p = n * 9000;
		} else {
			p = n * 10000;
		}
		
		System.out.println("가격은 " + p + "원 입니다");
	}
}
