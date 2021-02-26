package day10.ex;

import java.util.Arrays;
import java.util.Random;

/*
 	����2]
 		2���� ���� �迭�� ������� score�� ����� (10 �л� 5 ����)
 		
 		1. score �� ������ �����ϰ� �Է����ִ� �Լ� 
 		2. score �� �Էµ� ������ ���ؼ� ������ ������ִ� �Լ�
 		3. score �� �л����� ������ �������� �������� �������ִ� �Լ�
 		
 		�� �����ؼ� �����ϰ� ����� ����ϼ���.
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
