import java.util.Scanner;

public class Ex05_시분초 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력 : ");
		int time = sc.nextInt();
		
		int hour = time/3600;
		time = time%3600;
		int min = time/60;
		int sec = time%60;
		
		System.out.println(hour + "시 " + min + "분 "+ sec +"초");
		
	}
}