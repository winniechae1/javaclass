package day09.ex;

import java.util.Arrays;

/*
���� 2 ]
	1.
	�ټ����� ���� ������ ����� �迭(circle)�� ���弼��.
	���� ������ ������, �ѷ�, ���̸� ����ϵ��� �ϼ���.
	�������� �����ϰ� ���� �Է��ϼ���.
	
	------------------------------------------
	2. �� �迭�� 90�� ȸ����Ų �迭�� ���弼��.
*/
public class Ex02 {
	public static void main(String[] args) {
		
		double[][] c = new double[5][3];
		
		for(int i = 0; i < c.length; i++) {
				int rad = (int)(Math.random() * 9 + 1);
				c[i][0] = rad; 
				double len = 3.14 * 2 * rad;
				c[i][1] = len;
				double area = 3.14 * rad * rad;
				c[i][2] = area;
				
		}
		for( double [] circle : c) {
			System.out.println(Arrays.toString(circle));
		}
		
		System.out.println();
		double [][] c1 = new double[3][5];
		
		for(int i = 0; i < c1.length; i++) {
			for(int j = 0; j < c1[i].length; j++) {
				c1[i][j] = c[j][i];
			}
		}
		for(double [] c2 : c1) {
		System.out.println(Arrays.toString(c2));
		}
	}
}
