import java.util.Scanner;

public class Ex01_Switch문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch (n) {            //key에 연산식이 들어갈 수 있다.
								//key는 정수형, 문자열 데이터만 사용할 수 있다. 
		case 10:                // if (n == 10) :
			System.out.println("10을 입력했습니다.");
			break;
		
		case 20:                //else if (n == 20) :
			System.out.println("20을 입력했습니다.");
			break;
			
//		case 10:     동일한 case는 들어갈 수 없다. 오류가 뜬다.
//			break    if는 가능하다. 실행이 안 될 뿐.
		
//		case temp/5: 연산식, 변수를 사용할 수 없다. 
//			break;
						
		default:
			System.out.println("10, 20이 아닌 값을 입력했습니다.");
			break;
		}
	}
}
