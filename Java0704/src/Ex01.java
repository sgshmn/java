
public class Ex01 {

	public static void main(String[] args) {
		
		// 정수 10개를 저장하는 배열 생성
		int[] array = new int[10]; // new : 메모리 생성하는 키워드 
								   // 이 경우에는 정수형태 메모리 10개를 뜻한다
								   // int 형 배열 생성하면 0이 저장된다
		
		// 3번 인덱스에 10 저장
		array[3] = 10;
		System.out.println(array[3]);
		
		// 4번 인덱스에는 무슨 값이 있을까?
		System.out.println(array[4]);
		
		// 배열 길이
		System.out.println(array.length);

		// 배열을 생성해서 값을 지정 
		// 값이 결정되어 있을 때
		int[] array2 = {1, 2, 3, 4, 5};
		
		// !!!!!!!!!!!!!!!!!!!주의!!!!!!!!!!!!!!!!!!!!
//		int[5] array3; 배열 생성할 때 배열의 자료형 옆[]에는 아무것도 쓰면 안 된다
//		int array4[]; 이렇게 쓸 수 있지만 한눈에 배열인지 알기가 힘들다
		int[] array5;
//		array[5] = 2; 바로 이렇게 쓸 수 없다. new 키워드를 써서 배열을 생성한 뒤에 할 수 있다
		
		// 배열변수 (레퍼런스 변수)와 일반 변수의 다른점
		
		// 정수형 변수 5개를 저장하는 배열 생성
		
		array5 = new int[5];
		System.out.println(array5); // array5의 내용이 아니라 주소가 출력된다. 
		
	}
}
