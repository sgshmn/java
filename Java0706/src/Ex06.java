
public class Ex06 {

	public static void main(String[] args) {
		
		int num = 2134;
		int i = 11;
		
		System.out.println(i + "는 " + num + "의 약수인가요? >> " + isDivisor(num, i));
	}
	
	public static boolean isDivisor(int num1, int num2) {
		
		return num1 % num2 == 0; // boolean은 강력하다!!!!!!!
		
	}
}
