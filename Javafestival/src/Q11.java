import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {

		int[] ss = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.print("소프트웨어 설계 >> ");
		ss[0] = sc.nextInt();
		System.out.print("소프트웨어 개발 >> ");
		ss[1] = sc.nextInt();
		System.out.print("데이터베이스 구축 >> ");
		ss[2] = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 >> ");
		ss[3] = sc.nextInt();
		System.out.print("정보시스템 구축관리 >> ");
		ss[4] = sc.nextInt();

		boolean hapFactor = true;

		int sum = 0;
		for (int i = 0; i < ss.length; i++) {
			sum += ss[i];
		}

		if (sum < 60) {
			hapFactor = false;
		} else {
			for (int i = 0; i < ss.length; i++) {
				if (ss[i] < 8) {
					hapFactor = false;
					break;
				}
			}
		}
		if (hapFactor) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}
}
