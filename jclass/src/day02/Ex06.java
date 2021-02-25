package day02;
/*
 	문제6]
 		1년은 365.2426일이다.
 		이것은 며칠 몇시간, 몇 분, 몇초인지 계산해서 출력하세요.
 		
 		참고]
 			1일 : 24시간 
 			1시간 : 60분
 			1분 : 60초 
 			
 			따라서 0.5 일은  24 * 0.5 시간이므로  12시간이다. 
 			
 */
public class Ex06 {

	public static void main(String[] args) {
		
		double year = 365.2426;
		
		int day = 24; 
		int hour = 24 * day;
		int minute = 60 * hour;
		
		System.out.println("1년은 " + year * day + "시간이고" + year * hour +"분" + year*minute + "초이다.");
		
		
		/*
		 	필요한 변수 만들고 
		 	double tday = 365.2426;
		 	int day, hour, min, sec, tmp;
		 	
		 	일수 계산한다.
		 	day = (int) tday;
		 	
		 	일수를 뺀 결과를 초 단위로 변환한다.(tmp) 
		 	tmp = (int)((tday - day) * 24 * 60 * 60);
		 	
		 	시간 계산하고 
		 	hour = tmp / 3600;
		 	tmp %= 3600;
		 	
		 	분 계산하고 
		 	min = tmp / 60;
		 	
		 	결과 출력한다. 
		 	System.out.println("일년은" + tday + "이고 이것을 초 단위로 환산하면 " );
		 	System.out.println(day + "일" + hour + "시간" + min + "분" + sec + "초 입니다.");
		 */

	}

}
