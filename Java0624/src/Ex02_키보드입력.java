import java.util.Scanner;

public class Ex02_키보드입력 {
	
	public static void main(String[] args) {
		
		//키보드로 데이터 입력하기
		//Scanner
		
		Scanner sc = new Scanner(System.in); //sc는 변수
		
		
		
		System.out.print("정수를 입력하세요 : "); //ln은 줄을 바꾼다는 뜻
		int number = sc.nextInt();
		System.out.println("입력한 정수는 "+number+"입니다.");
				
	}
}
