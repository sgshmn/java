package Food;

public abstract class Super { // 추상메소드가 있다면 클래스도 추상클래스 abstract 달아주자
							  // 클래스에 final이 붙으면 상속이 안 된다.

	public abstract void noodle(); // body가 없는 메소드 : 추상메소드. abstract 달아주자

	final public void zzol() { // final 이 붙으면 오버라이딩 불가능
		System.err.println("환상의 쫄면!");
	}
}
