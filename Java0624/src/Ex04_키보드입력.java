import java.util.Scanner;

public class Ex04_키보드입력 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Java 점수 입력 : ");
		int javaScore = sc.nextInt();
		System.out.print("Web 점수 입력 : ");
		int webScore = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int androidScore = sc.nextInt();
		
		int sum = javaScore + webScore + androidScore;
		double avg = sum / 3.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		
	}
}
