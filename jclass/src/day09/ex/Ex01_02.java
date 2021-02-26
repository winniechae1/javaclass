package day09.ex;

import java.util.Arrays;

/*
 	stud�� score �迭�� �����ϴµ�
		������ ���� ����ϵ��� �迭�� ���� �����ϼ���.
		
			1. �л����� ���� ���
				==> int[][] stud1 = new int[5][4];
			2. ���� ����...
				==> int[][] score1 = new int[3][6];
		
 */
public class Ex01_02 {

	public static void main(String[] args) {
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
		
		System.out.println();
		
		System.out.println("### �л��� ���� ###");
		int[][] std1 = new int[5][4]; // ���� ���
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4-1; j++) {
				std1[i][j] = std[i][j];
				std1[i][std1[i].length-1] += std1[i][j];
			}
		}
		for(int [] st1 : std1) {
			System.out.println(Arrays.toString(st1));
		
		}
		
		System.out.println("### ���� ���� ###");
		int[][] score1 = new int[3][6];
		for(int i = 0; i < score1.length; i++) {
			for(int j = 0; j < score1[i].length-1; j++) {
				score1[i][j] = score[i][j];
				score1[i][score1[i].length-1] += score1[i][j];
			}
		}
		for(int [] s2 : score1) {
			System.out.println(Arrays.toString(s2));
		}
		System.out.println("### �л����� ���� ���� ###");
		int [][] total = new int[7][6];
		
		for(int i = 0; i < total.length; i++) {
			total[i][0] = std1[0][i];
			total[i][1] = std1[1][i];
			total[i][2] = std1[2][i];
			total[i][3] = std1[3][i];
			total[i][4] = std1[4][i];
		}
		System.out.print(Arrays.toString(total));
	}

}
