import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int num1 = rd.nextInt(100);
		int num2 = rd.nextInt(100);
		
		System.out.println(num1 + ", " + num2 + " 중 큰 수는?");
		System.out.println(biggerOne(num1, num2));
		
	}
	
	
	public static int biggerOne(int x, int y) { // 리턴하기로 했으면 반드시 return 쓰기
												// 아니면 리턴 타입을 void로 바꾸든가
		
		if (y < x) {
			return x;
		} else if (x < y) {
			return y;
		}
		return 0; // 메소드는 return을 만나면 즉시 돌아간다. 그래서 else를 쓰지 않아도 되는 경우가 있다. 
				  // 메소드 끝에는 return을 써야 헷갈리지 않는다. 나중에는 메소드가 매우 길어지기 때문에.. ㅎ
		
	}
}