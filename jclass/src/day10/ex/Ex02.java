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
	
	int[][] score = new int[10][6];
	
	public Ex02() {
		ranScore();
		setTotal();
		setSort();
		print();
	}
	public static void main(String[] args) {
		new Ex02();
	}
	
	public void ranScore() {
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length-1; j++) {
				int num = (int)(Math.random() * 40 + 60);
				score[i][j] = num;
			}
		}
	}
	
	public void setTotal() {
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length-1; j++) {
				score[i][score[i].length-1] += score[i][j];
			}
		}
	}
	
	public void setSort() {
		for(int i = 0; i < score.length-1; i++) {
			for(int j = i+1; j < score.length; j++) {
				int s1 = score[i][5];
				int s2 = score[j][5];
				if(s2 > s1) {
					int[] tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
	}
	
	public void print() {
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
	
}
