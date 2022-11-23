package Food;

public class Main {

	public static void main(String[] args) {
		
//		Super store1 = new Super();  // 추상 클래스는 객체를 생성할 수 없다 
									 // 추상 메소드가 있기 때문이다
//		store1.noodle();
		
		Sub store2 = new Sub();
		store2.noodle(); //  상속 받았당
		
		// 상속관계에서 상위클래스의 변수에 하위클래스의 객체가 담긴다
		
		Super store3 = new Sub();
		store3.noodle();
		
		// 업캐스팅 상태의 객체에서 오버라이딩한 메소드를 호출하면 하위클래스의 메소드 호출
		
		// Sub에서 손만두도 팔아보자
		
		((Sub)store3).mandoo(); // Super클래스에서는 mandoo를 정의하지 않았다
		// 업캐스팅 상태의 객체에서 하위 클래스에만 정의한 메소드를 호출할 때는 다운캐스팅 후 호출!
		
		
//		Super store31 = new Super();
//		((Sub)store31).mandoo(); 오류. 이렇게는 캐스트할 수 없다
		
		
		// Super가 가게만 제공, 일은 Sub가

	}
}
