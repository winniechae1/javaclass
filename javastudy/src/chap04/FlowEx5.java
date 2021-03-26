package chap04;

import java.util.*;
public class FlowEx5 {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ';
		char cpt = '0';
		
		System.out.print("점수를 입력해주세요.>");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		score = Integer.parseInt(tmp);
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if(score >= 90) {
			grade = 'A';
			
		}
		
	}

}
