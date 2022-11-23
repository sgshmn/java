import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {

		int[] scores = new int[3];

		Scanner sc = new Scanner(System.in);
		System.out.print("java 점수 : ");
		scores[0] = sc.nextInt();
		System.out.print("web 점수 : ");
		scores[1] = sc.nextInt();
		System.out.print("and 점수 : ");
		scores[2] = sc.nextInt();
		
		System.out.println("java : " + scores[0]);
		System.out.println("web : " + scores[1]);
		System.out.println("and : " + scores[2]);
		System.out.println("sum : " + (scores[0] + scores[1] + scores[2]));
		System.out.println("avg : " + (scores[0] + scores[1] + scores[2])/3);
		
	}
}