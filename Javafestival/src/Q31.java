
public class Q31 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '+';
		
		System.out.println(cal(num1, num2, op));
	}
	
	public static int cal(int num1, int num2, char op) {
		if (op == '+') {
			return num1 + num2;
		} else if (op == '-') {
			return num1 - num2;
		} else if (op == '*') {
			return num1 * num2;
		} else if (op == '/') {
			return num1 / num2;
		} else {
			System.out.println("잘 못 입력했어");
			return 0;
		}
	}
}
