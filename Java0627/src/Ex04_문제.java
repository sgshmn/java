import java.util.Scanner;

public class Ex04_문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("DB : ");
		int score1 = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int score2 = sc.nextInt();
		System.out.print("OS : ");
		int score3 = sc.nextInt();
		System.out.print("데이터 통신 : ");
		int score4 = sc.nextInt();
		System.out.print("소프트웨어공학 : ");
		int score5 = sc.nextInt();

		boolean fail = score1 < 8 || score2 < 8 || score3 < 8 || score4 < 8 || score5 < 8;
		boolean less = score1 + score2 + score3 + score4 + score5 < 60;

//		논리합과 논리곱
//		or : 논리합
//		and : 논리곱
		
		
		
		if (fail || less) {
			System.out.println("불합격입니다!");
		} else {
			System.out.println("합격입니다!");
		}

	}
}