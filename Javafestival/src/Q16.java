
public class Q16 {

	public static void main(String[] args) {

		int sv = 2;
		int ev = 10000;
		getPerfectNumber(sv, ev);
	}

	public static void getPerfectNumber(int sv, int ev) {

		System.out.print(sv + "부터 " + ev + "사이의 완전수 : ");

		for (int i = sv; i <= ev; i++) {
			int s = 0;
			for (int j = 1; j < i / 2 + 1; j++) {
				if (i % j == 0) {
					s += j;
				}
			}
			if (s == i) {
				System.out.print(i + " ");
			}
		}

	}
}
