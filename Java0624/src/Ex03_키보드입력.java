import java.util.Scanner;

public class Ex03_키보드입력 {

	public static void main(String[] args) {
		
		/*
		두 수를 입력받고 더하기, 빼기, 곱하기, 나누기를 하고
		결과를 출력하자
		입력 받을 때 Scanner 쓴다.
		
		*/
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt(); //숫자를 입력받고 num1에 저장
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 더하기 : "+(num1+num2));
		System.out.println("두 수의 빼기 : "+ (num1-num2));
		System.out.println("두 수의 곱하기 : "+ num1*num2);
		System.out.println("두 수의 나누기 : "+ num1/num2);
		
	}
}
