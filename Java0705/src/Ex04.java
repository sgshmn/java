import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		String[] names = {"이순신", "세종대왕", "김구", "정약용", "김홍도"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 쓰세요 >> ");
		String inputName = sc.next();
		
		int i = 0;
		
		
		for (i = 0; i < names.length; i++) {
			if (inputName.equals(names[i])) {
				System.out.println(inputName + "님은 " + i + "번 인덱스에 있어요!");
			}
		}
		
		boolean isFactor = false; // false면 배열에 이름이 없는 것
		for (i = 0; i < names.length; i++) {
			if (inputName.equals(names[i])) {
				isFactor = true; // true면 배열에 이름이 있다
			}
		}
		
		if (!isFactor) {
			System.out.println("걔는 누구냐?");
		}
		
	}
}
