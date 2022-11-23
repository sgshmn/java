package goong_gm;

import java.util.Random;

public class g1 {

	public static void main(String[] args) {

		int cnt = 0;

		Random rd = new Random();

		int mm = rd.nextInt(8145060);

		for (int i = 1; i <= 40; i++) {
			for (int j = i + 1; j <= 41; j++) {
				for (int k = j + 1; k <= 42; k++) {
					for (int l = k + 1; l <= 43; l++) {
						for (int m = l + 1; m <= 44; m++) {
							for (int n = m + 1; n <= 45; n++) {

								if (mm == cnt) {
									System.out.println(i + " " + j + " " + k + " " + l + " " + m + " " + n);
									i = 41;
									j = 42;
									k = 43;
									l = 44;
									m = 45;
									n = 46;
								}

								cnt++;

							}
						}
					}
				}
			}
		}

	}
}
