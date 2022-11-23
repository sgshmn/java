package Ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {

		System.out.println("\t\t 노래창고♪");
		Scanner sc = new Scanner(System.in);

		boolean isRunning = true;
		ArrayList<String> songs = new ArrayList<String>(); // ArrayList에는 wrapper 클래스 형태만 명시!
															// 자료형이 참조형이기만 하면 된다. 배열, 클래스 다 된다
															// int는 <Integer> Float은 <Float> 첫글자 대문자에 유의하자

		while (isRunning) {

			System.out.println("\t1\t2\t3\t4");
			System.out.println("\t▶\t■\t+\t-");

			System.out.print(">> ");

			switch (sc.nextInt()) {
			case 1:
				printPlaylist(songs); 
				break;

			case 2:
				System.out.println("\t\t   정지");
				break;

			case 3:
				System.out.println("\t\t새노래 넣기");
				System.out.print(">> ");
				songs.add(sc.next());

				break;

			case 4:
				System.out.println("\t\t노래 지우기");
				printPlaylist(songs);
				songs.remove(sc.nextInt() - 1);

				break;

			default:
				isRunning = false;

			}

		}
		System.out.println("\t\t창고 나가기");

	}

	public static void printPlaylist(ArrayList<String> songs) { // static이 필요하다. 아직은 이유를 모른다

		for (int i = 0; i < songs.size(); i++) {                // for each도 쓸수는 있는데 인덱스 달기 힘들다
			System.out.println((i + 1) + "> " + songs.get(i)); 
		}

	}

}
