
public class Ex02 {

	public static void main(String[] args) {
		
		// 문자열을 저장할 수 있는 배열 생성하고 과자이름 3개 저장
		
		String[] snacks = new String[3]; // 배열 이름은 복수형으로 쓰는게 좋다
										 

		System.out.println(snacks[0]); // String형 배열 생성하면 null값이 저장된다
		
		snacks[0] = "홈런볼";
		snacks[1] = "빼빼로";
		snacks[2] = "썬칩";
		
		
//		snacks[3] = "꼬북칩";  Exception : 배열 값을 벗어났기때문
		
		// 문자열을 저장할 수 있는 배열 생성하고 포켓몬 이름 5개 저장
		
		String[] monsters = {"피카츄", "라이츄", "꼬북이", "또또가스", "고라파덕" };
		
		snacks = monsters; // snacks는 3개, monsters는 5개
						   // snacks에 있던 값은 가비지 컬렉터에 있다 = 버림

		
		// monster를 바꾸기
		
		monsters[2] = "단데기";
		System.out.println(snacks[2]); // monsters를 바꿨는데 snacks가 바뀜
		
		// 주소가 같아졌기 때문
		System.out.println(snacks);
		System.out.println(monsters);
		
		// 주소 복사 : call by reference
		
	}
}
