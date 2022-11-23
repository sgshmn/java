import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;

		MP3Player player = new MP3Player();
		
		// 사용법
		// player.play(경로)
		
		ArrayList<Song> playlist = new ArrayList<Song>();
		
		playlist.add(new Song("letitgo","idinamenzel", "C:\\music\\IdinaMenzel-LetItGo.mp3"));
		playlist.add(new Song("nextlevel","aespa", "‪C:\\music\\aespa-NextLevel.mp3"));
		playlist.add(new Song("2002","annemarie", "C:\\music\\AnneMarie-2002.mp3"));
		playlist.add(new Song("circleoflife","carmen", "‪C:\\music\\CarmenTwillie,LeboM.-CircleofLife.mp3"));
		
		int playNum = 0;
		
		System.out.println("\t\t      노래창고♪");
		while (isRunning) {

			System.out.println("\t1\t2\t3\t4\t5");
			System.out.println("\t◁\t▶\t■\t▷\tΨ");
			System.out.print(">> ");

			switch (sc.nextInt()) {
			case 1: // 이전 곡
				if(player.isPlaying() && playNum > 0) {
					playNum--;
					player.stop();
					player.play(playlist.get(playNum - 1).getPath());
				} else {
					System.out.println("앞 노래가 없어");
				}
				break;

			case 2: // 노래하나 골라서 재생
				showPlaylist(playlist);
				
				playNum = sc.nextInt();
				player.play(playlist.get(playNum - 1).getPath());
				break;

			case 3: // 정지
				System.out.println("정지");
				player.stop();
				break;

			case 4: // 다음 곡
				if(player.isPlaying() && playNum < playlist.size()) {
					playNum++;
					player.stop();
					player.play(playlist.get(playNum - 1).getPath());
				} else {
					System.out.println("다음 노래가 없어");
				}
				break;
				
			case 5: // 메뉴
				System.out.println("\t\t1\t2\t3");
				System.out.println("\t\tQ\t+\t-");
				switch (sc.nextInt()) {
				case 1: // 검색
					System.out.println("노래 찾기");
					System.out.print(">> ");
					String findSong = sc.next();
					
					System.out.println("제목으로 찾기");
					
					for (int i = 0; i < playlist.size(); i++) {
						
						
						if (playlist.get(i).getName().equals(findSong)) {
							System.out.println((i + 1) + "] " + playlist.get(i).getName() + "   |   " + playlist.get(i).getSinger());
						}
						
						
					}
					
					System.out.println("가수로 찾기");
					for (int i = 0; i < playlist.size(); i++) {
						
						
						if (playlist.get(i).getSinger().equals(findSong)) {
							System.out.println((i + 1) + "] " + playlist.get(i).getName() + "   |   " + playlist.get(i).getSinger());
						}
						
						
					}
					break;
					
				case 2: // 노래 넣기
					System.out.println("새노래 넣기");
					System.out.println("제목 가수 경로를 차례로 넣어봐!");
					
					playlist.add(new Song(sc.next(), sc.next(), sc.next()));
					
					System.out.print(">> ");
					break;
					
				case 3: // 노래 지우기
					showPlaylist(playlist);
					System.out.println("노래 지우기");
					playlist.remove(sc.nextInt() - 1);
					break;
				}
				break;
				
			default:
				isRunning = false;

			}

		}
		System.out.println("창고 나가기");

	}
	
	
	public static void showPlaylist(ArrayList<Song> playlist) {
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("재생목록");
		
		for (int i = 0; i < playlist.size(); i++) {
			System.out.println((i + 1) +"] " + playlist.get(i).getName() +"   |   "+ playlist.get(i).getSinger());
		}
		
//		for (int i = 0; i < playlist.size(); i++) {   이렇게 하고 Song 클래스에서 toString을 잘 만지면 위와 똑같은 것을 쉽게 할 수 있다
//			System.out.println(playlist.get(i));
//		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}
