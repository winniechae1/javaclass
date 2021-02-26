package day08.ex;

import java.util.Arrays;

/*
 	문제1]
 		5명의 학생의 3과목 점수를 기억하는 배열을 만드세요.
 		단, 점수는 78 ~ 99점 사이로 랜덤하게 만들고 하나의 배열로 처리하세요.
 */
public class Ex01 {
	public static void main(String[] args) {
		
		int[][] std = new int[5][3];
		
		for(int i = 0; i < std.length; i++) {
			for(int j = 0; j < std[i].length; j++) {
				int score = (int)(Math.random() * (99 - 78 + 1) + 78);
				std[i][j] = score;
			}
			System.out.println(Arrays.toString(std[i]));
		}

	}

}
