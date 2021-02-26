package day10;

import java.util.Arrays;

/*
 	�� �ϳ��� �ݺ����� ���μ� ó���ϼ��� .
 	�� �迭���� ���� �迭�� 2��° �����͵�� ���� �迭�� ���� �ϼ��ϰ�
    5��° �����͵�� ���� �迭�� �ϼ��ϼ���.
    
    �� �ϳ��� �ݺ������� ���μ� ó���ϼ���.
 */
public class Test00 {

	public static void main(String[] args) {
		int[][] no = {
				{1,2,3,4,5},
				{2,3,4,5,6},
				{3,4,5,6,7},
				{4,5,6,7,8},
				{5,6,7,8,9},
				{4,5,6,7,8},
				{3,4,5,6,7}
		};
		/*
		 	0,1		0,2
		 	1,1		1,2
		 	2,1		2,2
		 	3,1
		 	..
		 	6,1
		 	
		 */
		int[] no1 = new int[7];
		int[] no2 = new int[7];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < no.length; j++) {
				if(i == 1) {
					no1[j] = no[j][i];
				}else if(i == 4) {
					no2[j] = no[j][i];
				}
			}
		}
		
		for(int i = 0; i < no.length; i++) {
			for(int j = 0; j < no[i].length; j++) {
				if(j == 1) {
					no1[i] = no[i][j];
				} else if(j == 4) {
					no2[i] = no[i][j];
				}
			}
		}
		for(int i = 0; i < no1.length; i++) {
			System.out.print(no1[i] + " | ");
		}
		System.out.println();
		for(int i = 0; i < no2.length; i++) {
			System.out.print(no2[i] + " | ");
		}
	}

}
