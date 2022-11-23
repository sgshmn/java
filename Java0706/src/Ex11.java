
public class Ex11 {

	public static void main(String[] args) {

		int a = 46340;
		System.out.println(a + " 까지의 소수의 개수 >> " + primeCnt(a));
	}

	public static int primeCnt(int num) {

		int cnt = 0;
		int pCnt = 1;

		for (int i = 3; i <= num; i++) {
			cnt = 0;

			for (int j = 1; j < num; j++) {
				if (i % j == 0) {
					cnt++;
				}
				
				if (cnt > 1) {
					break;
				}

				if (i < j * j) {
					break;
				}

			}
			if (cnt == 1) {
				pCnt++;
			}

		}
		return pCnt;

	}
}
