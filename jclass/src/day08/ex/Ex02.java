package day08.ex;

import java.util.Arrays;

/*
	���� 2 ]
		5�л��� 3���� ������ ������ ����ϴ� �迭�� ���弼��.
		��, ������ 70 ~ 99 �� ���̷� �����ϰ� ����� 
		�ϳ��� �迭�� ó���ϼ���.
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
