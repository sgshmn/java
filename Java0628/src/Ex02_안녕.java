import java.util.Scanner;

public class Ex02_안녕 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("user : ");
		String hi = sc.next();
		
		String respond = "";
				
		switch (hi) {
		case "안녕하세요":
			respond = "네, 안녕하세요!";
			break;
			
		case "반가워요":
			respond = "네, 반가워요!";
			break;
		
		case "수고하세요":
			respond = "네, 수고하세요!";
			break;
						
		default:
			respond = "잘못 입력하셨습니다.";
			break;
		}
		System.out.println("pc : " + respond);
	}
}
