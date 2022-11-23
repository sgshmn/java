
public class ex03_산술연산자 {
	public static void main(String[] args) {
//		1. 산술연산자 + - * / %
//		2. 대입연산자 =
//		3. 비교연산자 < > <= >= == !=
//		4. 논리연산자 && || !
//		5. 증감연산자 ++ --
//		6. 삼항연산자 ? : 
		int num1 = 10;
		int num2 = 7;
		float num3 = 10.0f;
		float num4 = 7.0f;
		String num5 = "10"; // String은 참조데이터타입이지만 한 번 해보자
		String num6 = "7";
		
		
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		System.out.println(num3/num4); // /연산자는 몫 연산이아니라 나누기 연산자다. 
		System.out.println(num1/num4); // 일종의 자동 형변환이다. 
		System.out.println(num1/(float)num2);
		System.out.println(num5+num6);
//		System.out.println(num5-num6); 요거 안된다. * / % 이거 다 안 된다. 문자열타입은 +만 된다. 
		System.out.println(num1+num6); // 문자열과 다른 타입을 +하면 결과는 문자열 끼리 +한 것처럼 나온다.
		
		// 연산순서에 유의해서 아래 문제를 예측해보자.
		
		String a = 10 + 7 + ""; // 17
		String b = 8 + "" + 2; // 82
		String c = "" + 5 + 2; // 52
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int num11 = 7;
		int num22 = 3;
		
		System.out.println("더하기 결과 : "+(num11 + num22));
		System.out.println("빼기 결과 : "+(num11 - num22));
		System.out.println("곱하기 결과 : "+num11*num22);
		System.out.println("나누기 결과 : "+(double)num11/num22);
		
		int numk = 456;
		System.out.println("결과확인 : "+numk/100*100);
		
	}
}
