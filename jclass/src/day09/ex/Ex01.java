package day09.ex;

import java.util.Arrays;

/*
문제 1 ]
	5학생의 3과목 점수를 기억하는 배열을 만드세요.
	단, 점수는 70 ~ 99 점 사이로 랜덤하게 만들고 
	하나의 배열로 처리하세요.
	
		==> int[][] stud = new int[5][3];
		
	3과목의 5학생의 점수를 기억할 배열을 만들고
	위 배열에서 데이터를 복사해서 채워넣으세요.
		==> int[][] score = new int[3][5];
		
	-----------------------------------------------
	stud와 score 배열을 복사하는데
	총점도 같이 기억하도록 배열을 만들어서 복사하세요.
	
		1. 학생들의 총점 계산
			==> int[][] stud1 = new int[5][4];
		2. 과목별 총점...
			==> int[][] score1 = new int[3][6];
	
	-----------------------------------------------
	학생별 총점과 과목별 총점을 같이 기억할 배열을 만들어서 복사해서 처리하세요.
	
	-----------------------------------------------------------------------------------------
	이름	국어	영어	수학	총점 	평균	석차
	홍길동	95		75		100		
	고길동	80		60		50	
	둘리
	...
	총점
	평균	
	
	이름	
	국어
	영어
	수학
	총점
	
*/
public class Ex01 {

	public static void main(String[] args) {
		/*
		 	5학생의 3과목 점수를 기억하는 배열을 만드세요.
	단, 점수는 70 ~ 99 점 사이로 랜덤하게 만들고 
	하나의 배열로 처리하세요.
	
		==> int[][] stud = new int[5][3];
		
	3과목의 5학생의 점수를 기억할 배열을 만들고
	위 배열에서 데이터를 복사해서 채워넣으세요.
		==> int[][] score = new int[3][5];
		 */
		
		int[][] std = new int[5][3];
		
		for(int i = 0; i < std.length; i++) {
			for(int j = 0; j <std[i].length; j++) {
				int sc = (int)(Math.random() * (99-70+1) + 70);
				std[i][j] = sc;
			}
			System.out.println(Arrays.toString(std[i]));
		}
		System.out.println();
		
		
		int[][] score = new int[3][5];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = std[j][i];	
		}
		}
		for(int[] s : score) {
			System.out.println(Arrays.toString(s));
			}
		
		
		
	}
}
