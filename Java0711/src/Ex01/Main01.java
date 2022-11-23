package Ex01;

public class Main01 { // main 메소드와 클래스 이름이 같으면 오류가 난다. 그래서 01을 뒤에 붙였다

	public static void main(String[] args) {
		
		// 포켓몬 도감 만들기
		
		// 1. 포켓몬의 정보를 저장한다
		// 이름, 속성, 몸무게, 성별, 출몰지역
		// String, String, int, boolean, String
		
		// 2. 포켓몬의 정보를 저장할 수 있는 새로운 자료형
		//	  (사용자 정의 자료형, Value Object, VO)을
		//    설계(클래스)한다.
		// 3. 포켓몬 3마리 생성
		
		Pokemon p1 = new Pokemon("yy", "skeptical", 17, false, "south");  // p1에는 주소가 저장되어있다
		
//		p1.name = "yy";  //  . : 참조하겠다
//		p1.chrctr = "skeptical";
//		p1.weight = 17;
//		p1.sex = false;
//		p1.hab = "south";
		
		
//		p1.chrctr = "good";
		// 만들어진 메모리(객체)의 변수에 언제나 접근이 가능하다.
		// 언제든지 수정할 수 있다
		
		// 접근제한자로 아무때나 접근할 수 없도록 수정해보자 
		// 이름을 객체 생성할 때 딱 한번만 지정할 수 있도록 수정하자
		
		Pokemon p2 = new Pokemon("meterpergas", "bright", 23, true, "west");
		
//		p2.name = "meterpergas";
//		p2.chrctr = "bright";
//		p2.weight = 23;
//		p2.sex = true;
//		p2.hab = "west";
		
		Pokemon p3 = new Pokemon("mintkite", "yellow", 13, true, "east");
		
//		p3.name = "mintkite";
//		p3.chrctr = "yellow";
//		p3.weight = 13;
//		p3.sex = true;
//		p3.hab = "east";
		
		
		// 후... 힘들었다... 그런데 출력은 어떻게 하지?
//		System.out.println(p1.name);  이거는 안 되네 private 때문
		// 변수에 저장한 값을 꺼내오는 기능을 설계해보자!
		
		Pokemon[] pokes = {p1, p2, p3};  // p1, p2, p3는 모두 Pokemon 자료형이다.
		
		for (int i = 0; i < 3; i++) {
			System.out.println(pokes[i].getName());
			System.out.println(pokes[i].getChrctr());
			System.out.println(pokes[i].getWeight());
			System.out.println(pokes[i].getSex());
			System.out.println(pokes[i].getHab());
			System.out.println();
		}
		
		// 포켓몬이 살이 찌거나 빠졌다
		// 몸무게를 바꾸자
		// 변수에 저장한 값을 수정하는 기능을 설계해보자!
		
		
		
		

	}

}
