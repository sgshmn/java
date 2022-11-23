import java.util.Random;
import java.util.Scanner;

public class Ex02_실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Up/Down 게임을 시작합니다");
		System.out.println("1부터 n까지의 숫자중 하나를 맞추는 게임입니다");
		System.out.println("숫자를 부르면 그 숫자를 정답과 비교합니다");
		System.out.println("정답이 그 숫자보다 크면 Up!");
		System.out.println("정답이 그 숫자보다 작으면 Down!");
		System.out.println("정답을 5번 안에 맞추면 성공입니다");
		System.out.println("게임을 시작하겠습니다");
		System.out.println("n을 입력하세요");
		int limit = sc.nextInt();
		limit--;
		
		Random random = new Random();
		int randomNumber = random.nextInt(limit) + 1;
		limit++;
		
		
		int inputNumber = 0;
		int tryCount = 0;
		while (true) {
			System.out.print("숫자 입력 >> ");
			inputNumber = sc.nextInt();
//			if (inputNumber < 1 || 99 < inputNumber) {    
//				continue;      continue는 그 즉시 다음 반복으로 간다. 
//			}				   continue 밑에 있는 명령은 실행하지 않는다. 내 코드보다 이게 더 보기 좋다.
			
			if (0 < inputNumber && inputNumber < limit) {
				tryCount++;
				if (randomNumber < inputNumber) {
					System.out.println("Down!");
				} else if (inputNumber < randomNumber) {
					System.out.println("Up!");
				} else {
					System.out.println(tryCount + "번 만에 맞췄어요");
					if (tryCount < 6) {
						System.out.println("고수네요");
					} else {
						System.out.println("Fail");
					}
					break;
				}
			} else {
				System.out.println("범위는 1부터 "+ (limit) + "입니다");
			}

		}
	}
}






