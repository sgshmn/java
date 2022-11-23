import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int numk = 100;
		
		int num1 = rd.nextInt(numk) - numk/2 + 10;
		int num2 = rd.nextInt(numk) - numk/2 + 10;
		
		System.out.println(num1 + ", " + num2 + " 중 10에  가까운 수는?");
		System.out.println(close10(num1, num2));
		
	}
	
	public static int close10(int x1, int x2) {
		
		
		return (x1 - 10) * (x1 - 10) < (x2 - 10) * (x2 - 10) ? x1 : x2;
		
				
		
//		int y1 = x1 < 10 ? 10 - x1 : x1 - 10;
//		int y2 = x2 < 10 ? 10 - x2 : x2 - 10;
//				
//		return y1 < y2 ? x1 : x2;
//		
//		
//		int y1 = Math.abs(x1 - 10);
//		int y2 = Math.abs(x2 - 10);
//		
//		if (y1 < y2) {
//			return x1;
//		} 
//		return x2;
		
	}
}
