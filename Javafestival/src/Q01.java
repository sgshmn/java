import java.util.Scanner;
	
public class Q01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("결과 : " + num/100*100);
	}
}
