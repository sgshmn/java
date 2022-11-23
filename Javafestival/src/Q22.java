import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		
		System.out.println("----다이어트 프로그램----");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int pwe = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int gwe = sc.nextInt();
		int i = 0;
		int lwe;
		while(pwe > gwe) {
			i++;
			
			System.out.print(i + "주차 감략 몸무게 입력 : ");
			lwe = sc.nextInt();
			pwe -= lwe;
			
		}
		System.out.println(i + "주차 다이어트 성공");
		
		
	}
}
