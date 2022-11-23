import java.util.Scanner;

public class Ex09_짝수홀수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int integer = sc.nextInt();
		
		String answer = (integer%2)==1 ? "홀수입니다." : "짝수입니다.";
		
		System.out.println(integer + "는(은) " + answer);
		
	}
}
