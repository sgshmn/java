import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		
		// ArrayList 써보기
		// 추가, 삭제, 전체삭제, 꺼내보기, 개수 알아내기
		
		ArrayList<String> teammates = new ArrayList<String>(); // 제네릭? 꺽쇠로 원하는 자료형 적는 기법
		
		// 추가
		
		teammates.add("선은진"); // 넣은 순서대로 index가 생긴다
		teammates.add("박화연");
		teammates.add("강교림");
		teammates.add("조승재");
		teammates.add("이영웅");
		
		// 꺼내보기
		
		System.out.println(teammates.get(1));
		
		// 삭제

		teammates.remove(1);
		System.out.println(teammates.get(1));  // 무슨 기능인지 알 필요가 읎다. 일종의 캡슐화
		
		// 개수 알아내기
		
		System.out.println(teammates.size());
		
		// 전체삭제
		
		teammates.clear();
		System.out.println(teammates.size());
		
		// 끼우기
		
		teammates.add("선은진"); 
		teammates.add("박화연");
		teammates.add("강교림");
		teammates.add("조승재");
		
		
		teammates.add(0, "이영웅");
		System.out.println(teammates.get(0));
		
	}
}
