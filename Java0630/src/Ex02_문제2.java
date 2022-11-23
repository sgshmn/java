import java.util.Scanner;

public class Ex02_문제2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nowWeight = 0;
		int goalWeight = 0;
		
		while (true) {
			System.out.print("현재 몸무게 : ");
			nowWeight = sc.nextInt();
		
			System.out.print("목표 몸무게 : ");
			goalWeight = sc.nextInt();
			if (goalWeight < nowWeight) {
				break;
			}
			System.out.println("다시 입력해 주세요");
			
		}
		
		int losingWeight = 0;
		
		int weekCount = 0;
				
		while (goalWeight < nowWeight) {
			weekCount++;
			
			System.out.print(weekCount + "주차 감량 몸무게 : ");
			losingWeight = sc.nextInt();
			
			nowWeight -= losingWeight;
			
		}
		
		System.out.println(nowWeight + "kg 달성!! 축하합니다!");
	}
}
