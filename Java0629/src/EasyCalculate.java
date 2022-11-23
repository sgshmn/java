
public class EasyCalculate {

	public static void main(String[] args) {
		
		int realYear = 0; // 실제 연도
		double day = 2; // 계산용 날수. 원래는 0부터 시작한다. 
						// 초기값 2를 넣으면 이상하게도 오차가 없다. 2^31-1 년까지 없다.
						// 초깃값 2 ~ 364는 오차가 없다
		double calYearF = 0; // 계산한 연도 소수점 떼기 전
		int calYear; // 계산한 연도
		int n = 0; // 오차가 있는 연도 개수
		while (realYear < 2147483647) {
			++realYear;
			if (realYear%400 == 0) {
				day += 366;
			} else if (realYear%100 == 0) {
				day += 365;
			} else if (realYear%4 == 0) {
				day += 366;
			} else { 
				day += 365;
			}
			
			calYearF = day/365.2425;
			calYear = (int)calYearF;
			if (realYear != calYear) {
				n++;
			}
		}
		System.out.println("오차 개수=" + n);
		System.out.println(day + "일");
	}
}
