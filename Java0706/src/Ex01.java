
public class Ex01 {

	public static void main(String[] args) {
		
		// 배열 심화?
		
		// String 배열 n칸 생성해서
		// 팀원 이름 다 넣기
		
		String[] teammates = {"이영웅", "윤선지", "김태완", "하승권"};
		
		
		// 확장 for문 또는 for-each문
		// 배열에 특화되어 있는 for문

		for(String temp : teammates) { // 배열에 있는 값을 하나씩 넣어서 반복한다 인덱스를 활용할 수는 없다
									   // 반드시 for문의 조건문에서 변수를 생성해야한다 밖에서 형성하면 실행이 안 된다
			System.out.print(temp + "\t");
		}
		System.out.println();
		
		// 알고 있는 선생님 이름 저장하는 String 배열 한 개 더 생성!
		
		String[] teachers = {"이은비", "강성관", "박승현"};
		
		// 배열을 100개 생성해라!
		
		// 위에 적은 두개의 배열을 한 묶음으로 만들어보자!!
		// 배열을 배열에 넣어보자 > 이차원 배열
		
		String[][] people = {teammates, teachers};
		
		System.out.println(people.length);
		System.out.println(people[0].length);
		
		System.out.println(people[1]); // teachers의 주소 출력
		
		System.out.println(people[0][1]); // teammates의 1번 인덱스 값 출력
		
		// people에 저장된 모든 값 출력하기
		
		int i;
		int j;
		
		for (i = 0; i < people.length; i++) {
			for(j = 0; j < people[i].length; j++) {
				System.out.print(people[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		for (String[] temp1 : people) {
			for (String temp2 : temp1) {
				System.out.print(temp2  + "\t");
			}
			System.out.println();
		}
		
		
		
	}
}
