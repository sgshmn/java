
public class Ex04 {

	public static void main(String[] args) {
		
//		(77*1) + (76*2) + (75*3) + ... + (1*77) ?
		int i;
		int result = 0;
		for (i = 1; i < 78; i++) {
			result += i*(78-i);
		}
		System.out.println(result);
	}
}
