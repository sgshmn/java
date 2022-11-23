
public class Ex03 {

	public static void main(String[] args) {
		
		
//		1 - 2 + 3 - 4 + 5 - ... + 99 - 100 ? 
		
		int i;
		int result = 0;
		
		for (i = 1; i <=100; i++) {
			result += i*(i % 2 != 0 ? 1 : -1);
		}
		System.out.println(result);
		
//		int i;
//		int result = 0;
//		int k = 1;
//		
//		for (i = 1; i <=100; i++, k *= -1) {
//			result += i * k;
//			
//		}
//		System.out.println(result);
		
	}
}
