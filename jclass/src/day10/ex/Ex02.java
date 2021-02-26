package day10.ex;

import java.util.Arrays;
import java.util.Random;

/*
 	문제2]
 		2차원 정수 배열의 멤버변수 score를 만들고 (10 학생 5 과목)
 		
 		1. score 에 점수를 랜덤하게 입력해주는 함수 
 		2. score 에 입력된 점수를 더해서 총점을 계산해주는 함수
 		3. score 의 학생들을 총점을 기준으로 내림차순 정렬해주는 함수
 		
 		를 제작해서 실행하고 결과를 출력하세요.
 */
public class Ex02 {
	
	int[][] score = new int[10][5];
	int[][] sum = new int[10][6];
	
	int test1;
	
	public Ex02() {
		
		
		score2();
		score3();
		
	}
	public static void main(String[] args) {
		new Ex02();

	}
	
	void randscore() {
		
	}
	
	
	void score2() {
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				sum[i][j] =score[i][j];
				int tmp = sum[i][j];
				sum[i][5] +=tmp;
			}
			System.out.println(Arrays.toString(sum[i]));
		}
		System.out.println();
	}
	
	void score3() {
		
		for(int i = 0; i < sum.length; i++) {
			for(int j = i+1; j < sum[i].length; j++) {
				int s1 = sum[i][5];
				int s2 = sum[j][5];
				if(s2 > s1) {
					int[] tmp = sum[i];
					sum[i] = sum[j];
					sum[j] = tmp;
				}
			}
			System.out.println(Arrays.toString(sum[i]));
		}
	}
		
	

}
