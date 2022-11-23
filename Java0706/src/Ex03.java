
public class Ex03 {

	public static void main(String[] args) {

		int a = 13, b = 17;

		System.out.println("더하기 " + add(a, b));

		System.out.println("빼기 " + sub(a, b));

		System.out.println("곱하기 " + multi(a, b));

		System.out.println("나누기 " + div_2f(a, b));

	}

	public static int add(int num1, int num2) {

		return num1 + num2;
	}

	public static int sub(int num1, int num2) {

		return num1 - num2;
	}

	public static int multi(int num1, int num2) {

		return num1 * num2;
	}

	public static double div_2f(int num1, double num2) {

		return (num1 / num2) - (num1 / num2) * 100 % 1 / 100;
	}

}
