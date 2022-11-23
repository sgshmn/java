package Machine;

public class Main {

	public static void main(String[] args) {
		
		// 인형뽑기 기계와 인형 클래스를 설계해보자
		// 1. 인형뽑기 기계에 인형을 넣으면 인형이 랜덤으로 뽑힘
		
		// 인형뽑기 기계 > Main안에 메소드
		// 인형은 각각 클래스로
		
		
		// 인형뽑기 기계 = 게임기, 인형 = 게임팩
		
		
		machine(new Pika());
		machine(new Kkobuk());
	
	}
	
	// 뽑기 기계 설계! 인형뽑기 기계에 인형 집어넣기
	public static void machine(Monster doll) {	
		// 아직은 Monster에 pick메소드가 없다 pick 메소드를 호출할 수 없다
		
		// 해결방안 1 : 업캐스팅한 객체를 원래 타입으로 다운캐스팅하면?
//		((Pika)doll).pick(); Pika만 되고 Kkobuk은 안되서 에러
		// 무작정 바꾸지 않고 객체가 어떤타입인지 알고 바꾸면 된다.
		
//		if (doll instanceof Pika) { // doll이 Pika타입이라면
//			((Pika)doll).pick();
//		} else if (doll instanceof Kkobuk) { // doll이 Kkobuk타입이라면
//			((Kkobuk)doll).pick();
//		}
		// 얘도 문제가 많다
		
		
		// 해결방안 2 : 상위클래스인 Monster에 pick이라는 메소드를 만들면?
		doll.pick();
		// ??? ???? ????? 해결이 되긴했는데 왜 Monster에 있는 pick이 아니라 하위 클래스의 pick이 호출이 됐을까?
		// pick 메소드를 오버라이딩(재정의)하면
		// 하위 클래스의 pick 메소드가 더 낫다고 생각한다
		
		
		
		
	}
	
	
	// 메소드 이름은 같지만 매개변수 타입이 다르다!  > 오버로딩 중복정의
	// 지금은 피카츄 전용기계, 꼬북이 전용기계다. 새로운 인형이 생기면 곤란하다
	
}
