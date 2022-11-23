
public class Ex01 {

	public static void main(String[] args) {
		
//		for (초기화 구문(a); 검사 조건(b); 반복 후 작업(c)) {
//			명령(d)
//		}   실행과  
//			 a > b(true) > d > c
//		       > b(true) > d > c
//		           .
//		           .
//		           .
//		       > b(false)> 끝
		
		
//		변수
//		생성 ? 사용(참조)?
//		생성할 때는 자료형을 붙이고 사용(참조)할 때는 자료형을 붙이지 않는다. 
//		초기화는 refresh가 아니고 initiate이다. 
		
		int i;
		
		for (i = 21; i < 58; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (i = 96; 52 < i; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (i = 21; i < 58; i += 2) {
			System.out.print(i + " ");
		}
		
		
	}
}
