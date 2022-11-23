import java.util.Scanner;

public class Ex11_농구공담기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요 : ");
		int n = sc.nextInt();
		
		n = (n-1)/5 + 1;
		System.out.println("필요한 상자의 수 : " + n);

	}
}