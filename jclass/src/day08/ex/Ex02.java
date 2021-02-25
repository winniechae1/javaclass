package day08.ex;

import java.util.Arrays;

/*
	문제 2 ]
		5학생의 3과목 점수와 총점을 기억하는 배열을 만드세요.
		단, 점수는 70 ~ 99 점 사이로 랜덤하게 만들고 
		하나의 배열로 처리하세요.
*/

public class Ex02 {

	public static void main(String[] args) {

		int[][] std = new int[5][4];
			
			for(int i = 0; i < std.length; i++) {
				for(int j = 0; j < std[i].length-1; j++) {
					int score = (int)(Math.random() * (99-70+1)+70);
					std[i][j] = score;
					std[i][std[i].length-1] = std[i][std[i].length-1] + score;
				}
				System.out.println(Arrays.toString(std[i]));
			}

	}

}
