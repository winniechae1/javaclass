package day07.ex;

import java.util.Arrays;

/*
 	����5]
 		int[][] stud = new int[5][6];
 		
 		int[] score = new int[6];
 		
 		�ټ� ���� �л��� 5������ ������ ����� �迭�� ����� 
 		�����ϰ� ������ �Է��ؼ� 
 		�� ������ �濡�� ������ ����ؼ� �ְ� 
 		
 		stud[i] = score;
 		������ ���� ���� ������� ������ �ؼ� ����ϼ���.
 	
 	����]
 		�迭�ȿ� �迭�� �ٽ� ���� �� �ִ�. 
 		�̶� ���ǻ����� �迭���� �ϳ��� ���� ���� �迭�̶�� ���� ����ؾ� �Ѵ�. 
 		
 */
public class Ex05 {

	public static void main(String[] args) {
		
		int[][] std = new int[5][6]; // [�л���][5����+����]
		 
		
		for(int i = 0; i < std.length; i++) {
//			std[i] >> �迭�� ������ �ȴ�
			for(int j = 0; j < std[i].length-1; j++) {
				// std[i] >> �迭
				// std[i].length >> i ��° �迭�� ����
				int score = (int)(Math.random() * 41 + 60);
				std[i][j] = score;
				std[i][std[i].length -1] += score;
			}
//			System.out.println(Arrays.toString(std[i]));
			 
			/*
			// ���� ���
			// ������ i ��° �濡 ����ִ� �迭�� ���� ����
			for(int j = 0; j < std[i].length - 1; j++) {
				int no = std[i][j];
				std[i][std[i].length -1] += no;
			}
			
			*/
			System.out.println(Arrays.toString(std[i]));
		}
		// �����Ѵ�.
		// ������ ���� ���� ����� �� �տ� ������ �ϸ� �ȴ�.
		// �̶� ������ ������ �ּҸ� �� ���ڸ��� �Ű��ش�.
			for(int i = 0; i < std.length -1; i++){
				for(int j = i+1; j < std.length; j++) {
					int t1 = std[i][5];
					int t2 = std[j][5];
					if(t2 > t1) {
						int[] tmp = std[i]; // �迭 �ּҸ� ����� �ӽú��� 
						std[i] = std[j];	// j��° �ּҸ� i��°�� ���, i��°�� j��°���� ���� �ּҰ� ���Ǿ��ִ�.
						std[j] = tmp;		// �ӽú����� ���� �ּҸ� j��°�� �ٲ��ְ� 
					}
				}
			}
			System.out.println("###### ���� �� ######");
			for(int[] t : std) {
				System.out.println(Arrays.toString(t));
			}
		// �� ����� ù��° ������ �������� �����ؼ� ����ϼ���.
			
			for(int i = 0; i < std.length -1; i++) {
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
			System.out.println("####### ù��° ���� �� #######");
			for(int[] s : std) {
				System.out.println(Arrays.toString(s));
			}
	}

}
