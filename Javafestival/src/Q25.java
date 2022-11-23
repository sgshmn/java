
public class Q25 {

	public static void main(String[] args) {

		int input = 9;

		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}

	}

	public static int fibo(int num) {
		if (num <= 2) {
			return 1;
		}

		return fibo(num - 2) + fibo(num - 1);

	}
}
