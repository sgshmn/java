package Ex02;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		
		// 음악 정보
		
		// 1. 노래 정보
		// 제목, 가수, 재생시간(초), 발매일, 장르
		
		// 2. 5곡 생성 *캡슐화를 만족해야한다(private)
		// 3. 모든 노래의 정보를 출력 
		
		
		// 4. (심화) 검색하고 싶은 가수이름을 입력받아 해당하는 노래의 정보를 모두 출력하기
		// ex) 아이유
		// 아이유 노래 다 나옴
		
		Norae p1 = new Norae("sunday bloody sunday", "U2", 280, 1983, "punk");
		Norae p2 = new Norae("with or without you", "U2", 296, 1987, "altenative");
		Norae p3 = new Norae("dlwlrma", "IU", 177, 2017, "jazz");
		Norae p4 = new Norae("비밀의 화원", "IU", 225, 2017, "folk");
		Norae p5 = new Norae("my name is", "eminem", 269 ,1999, "hiphop");
		
		Norae[] likedSongs = {p1, p2, p3, p4, p5};
		
//		for (int i = 0; i < likedSongs.length; i++) {
//			
//			System.out.println("제목 >> " + likedSongs[i].getSong());
//			System.out.println("가수 >> " + likedSongs[i].getSinger());
//			int k = likedSongs[i].getPlaytime();
//			System.out.println("재생시간 >> " + k/60 + "분 " + k%60 + "초");
//			System.out.println("발매년도 >> " + likedSongs[i].getRelYear() + "년");
//			System.out.println("장르 >> " + likedSongs[i].getGenre());
//			System.out.println();
//		}   //모든 가수의 노래 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("누구노래 듣고싶어? >> ");
		String singer = sc.next();
		
		for (int i = 0; i < likedSongs.length; i++) {
			
		}
		
		
		for (int i = 0; i < likedSongs.length; i++) {
			
			if (singer.equals(likedSongs[i].getSinger())) {
				System.out.println("제목 >> " + likedSongs[i].getSong());
				System.out.println("가수 >> " + likedSongs[i].getSinger());
				int k = likedSongs[i].getPlaytime();
				System.out.println("재생시간 >> " + k / 60 + "분 " + k % 60 + "초");
				System.out.println("발매년도 >> " + likedSongs[i].getRelYear() + "년");
				System.out.println("장르 >> " + likedSongs[i].getGenre());
				System.out.println();
			}	
			
		}
		
		
//		for (int i = 0; i < likedSongs.length; i++) {
//			System.out.println(likedSongs[i]);
//		} 원래는 주소가 나온다
		
		
		
	}
}






// 배열의 한계

// 1. 같은 자료형만 저장할 수 있다 >> VO로 해결
// 2. 한 번 만들어진 방의 개수를 늘리거나 줄일 수 없다 >> ArrayList(가변배열)로 해결
//                                          >> Java에서 제공하는 API다.
//                                          >> 추가, 삭제, 전체삭제, 꺼내보기
















