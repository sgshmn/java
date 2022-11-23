
public class Q19 {

	public static void main(String[] args) {
		
		
		int hap = 0;
		for (int i = 1; i < 78; i++) {
			hap += i * (78 - i);
		}
		System.out.println(hap);
	}
}
