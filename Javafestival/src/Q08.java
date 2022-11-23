
public class Q08 {

	public static void main(String[] args) {
		
		int[] point = {92, 32, 52, 9, 81, 2, 68};
		int in1 = 0;
		int in2 = 1;
		int a;
		int b;
		for (int i = 0; i < point.length; i++) {
			for(int j = i + 1; j < point.length; j ++) {	
				a = point[in1] - point[in2];
				b = point[i] - point[j];
				if (a*a > b*b) {
					in1 = i;
					in2 = j;
				}
			}
		}
		
		System.out.println("["+ in1 + ", " + in2 + "]");
		
		
		
	}
}
