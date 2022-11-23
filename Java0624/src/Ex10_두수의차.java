import java.util.Scanner;

public class Ex10_두수의차 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = num1 - num2;
		result = result < 0 ? -result : result;
		
		System.out.println("두 수의 차 : " + result);
		
	}
}
