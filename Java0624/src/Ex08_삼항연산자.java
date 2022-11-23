
public class Ex08_삼항연산자 {

	public static void main(String[] args) {
		
		//삼항연산자는 부울변수에 따라서 결과를 다르게 처리하는 연산자이다. 
		//구조 : (부울 변수) ? true일 때 : false일 때
		
		int num1 = 3;
		int num2 = 10;
		
		
		//삼항연산자의 결과값을 변수로 저장할 때
		//결과값의 자료형에 맞춰서 변수타입을 정의하자
//		String result = (num1==num2) ? "같다" : "다르다";
		int result = (num1==num2) ? 1 : 0;
		
		
		System.out.println(result);
		
	}
}
