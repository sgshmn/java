import java.util.Scanner;

public class Ex01_문제1 {

	public static void main(String[] args) {

		String id = "yoonsunji"; // final을 String앞에 쓰면 id가 상수가 된다. 이런 경우에는 ID로 대문자로 쓰는게 관습이라고 한다.
		int password = 910311; // 만약 0311로 했다면 8진수 311로 컴퓨터가 알아먹는다. 0으로 시작했기 때문이다. 조심하자.

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("아이디를 입력하세요  | ");
			String inputId = sc.next();

			System.out.print("비밀번호를 입력하세요 | ");
			int inputPassword = sc.nextInt(); // String inputPassword 이렇게 하면 어떻게 될까? 위에 password도 String으로 해야한다.

			if (id.equals(inputId) && password == inputPassword) {
				// int 변수에는 값이 저장되어있다. 기본변수이기 때문이다. String은 레퍼런스 변수이기 때문에 값이 아니라 값이 있는 주소가 들어있다.
				// 그래서 == 같은 우리가 쓰는 비교 연산자로는 내가 원한는 결과가 나오지 않는다.
				// String은 Java가 우리에게 주는 선물이다. ? C에는 string이 없다. 배열로 해야한다.
				break;
			} else {
				System.out.println("로그인 실패!");
			}

//			if (!id.equals(inputId) || password != inputPassword) { 위의 if문의 다른표현 방법이다. 첫번째 조건문 앞에 !가 붙어있다.(not) 
//				break;
//			} else {
//				System.out.println("로그인 실패!");
//			}

		}

		System.out.println("로그인 성공!");
		System.out.println(id + "님 환영합니다!");

	}
}
