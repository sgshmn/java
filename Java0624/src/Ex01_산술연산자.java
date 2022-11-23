
public class Ex01_산술연산자 {
	
	public static void main(String[] args) {
		
		// 백의자리 이하를 버리는 프로그램
		// 1. 정수형 변수를 선언하고 456으로 초기화
		// 2. 456을 400으로 출력하기
		
		int num1 = 456;
		int result1 = num1/100*100;
		
		System.out.println(result1);
		
		//일의 자리를 1로 바꾸는 프로그램
		//1. 정수형 변수를 선언하고 456으로 초기화
		//2. 일의 자리를 1로 바꾸고 출력하기
		
		int num2 = 824;
		int result2 = num2/10*10 + 1;
		
		System.out.println(result2);
		
	}
}
