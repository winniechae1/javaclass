package day08.ex;

import java.util.Arrays;

/*
 	����1]
 		5���� �л��� 3���� ������ ����ϴ� �迭�� ���弼��.
 		��, ������ 78 ~ 99�� ���̷� �����ϰ� ����� �ϳ��� �迭�� ó���ϼ���.
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
		System.out.println();
	}

}
