
public class Ex06_복합대입연산자 {

	public static void main(String[] args) {
		
		int num = 29;
		
//		num = num - 2;
		num -= 2;
		
//		num = num + 2;
		num += 2;
		
		//연산순서
		num -= 2 + 3 * 4;//복합대입연산자는 산술연산자 이후에 연산한다.	
		
		System.out.println(num);
	}
}
