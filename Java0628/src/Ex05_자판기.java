import java.util.Scanner;

public class Ex05_자판기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("돈을 넣으세요"); // 자판기에 돈 넣기
		int cash = sc.nextInt();
		
		System.out.println("상품번호를 고르세요"); // 상품 고르기
		System.out.println("1 콜라(800)원");
		System.out.println("2 생수(500)원");
		System.out.println("3 비타민워터(1500)원");
		int goods = sc.nextInt();
		
		int cases = 2; // 가격과 넣은 돈 비교
		int price = 0; 
		
		if (0 < goods && goods < 4) { 					// 상품 번호에 따른 가격
			if (goods == 1) {
				price = 800;
			} else if (goods == 2) {
				price = 500;
			} else if (goods == 3) {
				price = 1500;
			}
			
			if (cash < price) {							// 상품 번호가 잘못된 경우 cases는 2다.
				cases = 0;
				cash = price - cash;
			} else {
				cases = 1;
				cash = cash - price;
			}
		}
		
		
		if (cases == 0) {										// 상품 가격보다 돈을 적게 넣었을 때
			System.out.println("돈을 더 넣으세요");
			System.out.println("더 필요한 돈 : " + cash + "원");
		} else if (cases == 1) {								// 돈을 충분히 넣었을 때
			System.out.println("상품이 나왔습니다");
			if (cash == 0) {
				System.out.println("잔돈이 없습니다");
			} else {
				System.out.println(cash + "원이 남았습니다");
				int k = cash/1000;
				System.out.println("천원 " + k + "개");
				k = cash%1000/500;
				System.out.println("오백원 " + k + "개");
				k = cash%500/100;
				System.out.println("백원 " + k + "개");
				k = cash%100/50;
				System.out.println("오십원 " + k + "개");
				k = cash%50/10;
				System.out.println("십원 " + k + "개");
			}
			
		} else {												// 상품 번호를 잘못 입력했을 때
			System.out.println("상품이 없습니다");
		}
		
	}
	
}
