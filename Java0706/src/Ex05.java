import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int a = rd.nextInt(100) - 50;
		System.out.println(a);
		System.out.println(whatSign(a));
	}
	
	
	public static String whatSign(int num) {
		
		if (num < 0) {
			return "음수입니다!";
		} else if (0 < num) {
			return "양수입니다!";
		} 
		return "0 입니다!";
		
	}
}
