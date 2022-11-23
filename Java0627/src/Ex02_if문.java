import java.util.Scanner;

public class Ex02_if문 {

	public static void main(String[] args) {
//		
//		if(조건식) { 조건문이 true 일때
//			실행문1;
//			실행문2; ... 실행문n;		
//		}else{ 조건문이 false 일때
//			실행문1;
//			실행문2; ... 실행문n;
//		}
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		
		if (age>=20) {
			System.out.println("성인입니다.");
			
		}else {
			System.out.println("미성년자입니다.");
		}
		
		System.out.println("프로그램 종료!");
		
	}
}
