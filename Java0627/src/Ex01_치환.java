
public class Ex01_치환 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 111;
		
		System.out.println(num1 + ", " + num2);
		
		//치환
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(num1 + ", " + num2);
		
	}
}
