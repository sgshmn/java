package Ex02;

public class Norae {

	private String song;
	private String singer;
	private int playtime;
	private int relYear;
	private String genre;
	
	public Norae(String song, String singer, int playtime, int relYear, String genre) {
			
		this.song = song;
		this.singer = singer;
		this.playtime = playtime;
		this.relYear = relYear;
		this.genre = genre;
			
			
	}
		
	public String getSong() {
		return song;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public int getPlaytime() {
		return playtime;
	}
	
	public int getRelYear() {
		return relYear;
	}
	
	public String getGenre() {
		return genre;
	}

	
	// 출력할 때 객체의 주소가 아닌 정보를 출력하는 방법
	// toString()
	// println 메소드 내부에서 호출되는 메소드
	// 객체 내의 필드 정보를 문자열로 만들어서 리턴
	// 만일 toString 메소드를 설계하지 않으면 객체의 주소를 리턴한다
	
	
	@Override
	public String toString() {
		return "Playlist [song=" + song + ", singer=" + singer + ", playtime=" + playtime + ", relYear=" + relYear
				+ ", genre=" + genre + "]";
	}
	
	
	
	
	
}
