package chap04;

import java.util.*;
public class FlowEx5 {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ';
		char cpt = '0';
		
		System.out.print("������ �Է����ּ���.>");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		score = Integer.parseInt(tmp);
		
		System.out.printf("����� ������ %d�Դϴ�.%n", score);
		
		if(score >= 90) {
			grade = 'A';
			
		}
		
	}

}
