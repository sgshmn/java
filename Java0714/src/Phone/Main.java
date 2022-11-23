package Phone;

public class Main {

	public static void main(String[] args) {
		
		 스마트폰 phone1 = new 스마트폰();
		 phone1.answer(); // 스마트폰에서 answer이라는 메소드를 만든 적 없다
		 				  // 상속받았기 때문에 부모클래스의 메소드를 그대로 쓸 수 있다 싱기싱기
		 
		 피쳐폰 phone2 = new 피쳐폰();
		 phone2.call();  // 얘도 된다
		 
		 
		 
		 // 하위클래스는 상위클래스 계열이라고 할 수 있다
		 // 상위클래스 타입의 레퍼런스 변수에 하위클래스 타입의 객체주소를 저장할 수 있다
		 핸드폰 phone3 = new 스마트폰(); // 업캐스팅
		 핸드폰 phone4 = new 피쳐폰();  // 업캐스팅

		 
		 핸드폰[] phones1 = {new 스마트폰(), new 피쳐폰()}; // 이게 된다
		 
		 // 상위클래스?
		 // 하위클래스?
		 // 업캐스팅?
		 // 업캐스팅이 가능한이유?
		 
		 
		 
		 
		 
		 
		 
	}
}
