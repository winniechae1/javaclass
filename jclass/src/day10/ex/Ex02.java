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
