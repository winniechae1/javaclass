package day08.ex;

import java.util.Arrays;

/*
���� 3 ]
	2�� �������� ���� �迭�� 
	������ �������� �������� �����ϼ���.
	
	�ɼ� ]
		ù��° ��������� ����,
		�ι�° ���� ������ ����,
		����° ���� ������ ����
*/
public class Ex03 {

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
		
		for(int i = 0; i < std.length-1; i++) {
			for(int j = i+1; j < std.length; j++) {
				int t1 = std[i][3];
				int t2 = std[j][3];
				if(t2 > t1) {
					int[] tmp = std[i];
					std[i] = std[j];
					std[j] = tmp;
				}
			}
		}
		System.out.println("### ���� �� ###");
		for(int[] t : std) {
			System.out.println(Arrays.toString(t));
		}
		
		for(int i = 0; i < std.length-1; i++) {
			for(int j = i+1; j < std.length; j++) {
				int t1 = std[i][0];
				int t2 = std[j][0];
				if(t2 > t1) {
					int[] tmp1 = std[i];
					std[i] = std[j];
					std[j] = tmp1;
				}
			}
		}
		System.out.println("### ���� �� ###");
		for(int[] s : std) {
			System.out.println(Arrays.toString(s));
		}
		
		for(int i = 0; i<std.length-1; i++) {
			for(int j = i+1; j < std.length; j++) {
				int t1 = std[i][1];
				int t2 = std[j][1];
				if(t2 > t1) {
					int[] tmp2 = std[i];
					std[i] = std[j];
					std[j] = tmp2;
				}
			}
		}
		System.out.println("###�ι�° ���� ���� �� ###");
		for(int[] two : std) {
			System.out.println(Arrays.toString(two));
		}
		
		for(int i = 0; i < std.length-1; i++) {
			for(int j = i+1; j < std.length; j++) {
				int t1 = std[i][2];
				int t2 = std[j][2];
				if(t2 > t1) {
					int[] tmp3 = std[i];
					std[i] = std[j];
					std[j] = tmp3;
				}
			}
		}
		System.out.println("###����° ���� ���� ��###");
		for(int[] th : std) {
			System.out.println(Arrays.toString(th));
		}
	}
	

}
