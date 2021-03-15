package day18;
/*
 	현재 컴퓨터의 날짜와 시간을 출력해보자
 */
import java.util.*;

public class Test06 {

	public Test06() {
		Date date = new Date();
		toPrint(date);
		try {
			Thread.sleep(3000);	// 3초동안 얼음..
		} catch (Exception e) {
			
		}
		System.out.println();
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);	// 3초동안 얼음..
			} catch (Exception e) {
				
			}
			date = new Date();
			toPrint(date);
			System.out.println();
		}
	}
	public void toPrint(Date date) {
		int year = date.getYear() + 1900;
		System.out.print(year + " 년, ");
		//	년도의 기준은 1900년을 기준으로 하기 때문에 꺼내온 데이터의 1900을 더해줘야 정확한 년도가 나온다.
		int month = date.getMonth()+1;
		System.out.print(month+ " 월, ");
		//	월의 시작을 0부터 계산을 하기 때문에 정확한 달은 +1을 해줘야 한다.
		int day = date.getDate();
		System.out.print(day+ " 일, ");
		int week = date.getDay();
		String sweek = getSweek(week);
		
		System.out.print(sweek + ", ");
		
		int hour = date.getHours();
		System.out.print(hour+ " 시, ");
		
		int min = date.getMinutes();
		System.out.print(min +" 분, ");
		
		int sec = date.getSeconds();
		System.out.print(sec + " 초 ");
		
	}
	public String getSweek(int week) {
		String sweek = "";
		switch(week) {
		case 0:
			sweek = "일요일";
			break;
		case 1:
			sweek = "월요일";
			break;
		case 2:
			sweek = "화요일";
			break;
		case 3:
			sweek = "수요일";
			break;
		case 4:
			sweek = "목요일";
			break;
		case 5:
			sweek = "금요일";
			break;
		case 6:
			sweek = "토요일";
			break;	
		}
		return sweek;
	}
	public static void main(String[] args) {
		new Test06();
	}

}
