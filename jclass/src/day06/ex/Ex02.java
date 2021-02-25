package day06.ex;
/*
 	문제2]
 		달팽이가 전봇대 (100m)에 올라간다.
 		낮이면 0.87m를 올라가고 
 		밤이면 0.35m를 미끄러져 내려온다.
 		
 		며칠만에 이 달팽이는 정상에 올라갈 것인가?
 		단, 꼭대기에 올라가면 미끄럼은 없다.
 */
public class Ex02 {

	public static void main(String[] args) {
		
		int day = 0;
		double snail = 0;
		boolean complete = false;
		
		while(true) {
			day++;
			snail = snail + 0.87;
			if(snail >= 100) {
				complete = true;
				break;
			}
			snail = snail - 0.35;
		}
		if(complete) { // complete << complete == true
			System.out.println("반복문 중간에 종료!");
		}
		System.out.println("달팽이는" + day + "일만에 정상에 올라갑니다");
		/*
		for(int d = 1; ; d++) {
			if((0.52*d)>=(100-0.35)) {
				System.out.println(d + "일");
				break;
			}
		}
		*/
	}
}


