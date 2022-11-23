package goong_gm;

import java.util.Random;

public class gg {

	public static void main(String[] args) {
		
		
		int[] nn = new int[100000];
		Random rd = new Random();
		
		
		for (int i = 0; i < nn.length; i++) {
			nn[i] = rd.nextInt(100000);
			for (int j = 0; j < i; j++) {
				if (nn[i] == nn[j]) {
					i--;
					break;
				}
			}
		}
		
		
		System.out.println("내가 1등");
		
		
	}
}
