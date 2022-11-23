package Ex01;

public class Pokemon {

	// VO가 가지고 있어야하는 속성 정의 = 변수 = 필드
	private String name;
	private String chrctr;
	private int weight;
	private boolean sex; // false : male	true : female
	private String hab;
	
	// 이름을 저장하는 기능(method) 설계하자
	// 메소드이긴한데 객체 생성할 때 딱 한번만 호출하는 메소드가 필요하다 > 생성자
	// 특징!
	// 1. 메소드 이름을 클래스의 이름과 똑같이 설계한다
	// 2. 리턴 타입을 생략한다
	
	
	// 생성자의 매개변수를 활용해서 모든 필드를 초기화하도록 설계한다
	// 객체 생성할 때 반드시 모든 필드값을 지정해야한다
		
	public Pokemon(String name, String chrctr, int weight, boolean sex, String hab) {
		// 이 생성자는 이름을 지정하는 일을 할거야!
		
		System.out.println("생성자 나와!");
		this.name = name; // 지역변수 name과 위의 필드 name이 헷갈리기 때문에 this를 붙여야한다
						  // 지역변수와 필드변수의 이름이 다르면 이렇게 할 필요가 없지만 효율적이지 않다
						  // 그런데 왜 this가 붙은 name이 필드인지 모르겠다
		this.chrctr = chrctr;
		this.weight = weight;
		this.sex = sex;
		this.hab = hab;
		
	
	}
	
	// 값을 꺼내는 기능(메소드)
	public String getName() {
		return name; // this를 붙이지 않는다
					 // 구분 안 해도 되니까
	}
	
	public String getChrctr() {
		return chrctr;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public boolean getSex() {
		return sex;
	}
	
	public String getHab() {
		return hab;
	}
	
	// 값을 전달해주면 필드에 반영하는 메소드
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	// 사용자 정의 자료형 Value Object 구성
	
	// 1. 필드(변수)
	// 2. 생성자
	// 3. get/set
}
