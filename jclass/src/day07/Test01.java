package day07;
/*
 	 5���� �л��� ������ ����� �迭�� ����µ� �� �迭���� 
 	 ������ ���� �����ϵ��� �ϰ� �����ϰ� �л����� ������ 
 	 �Է��ϰ� ������ ���ϰ� ����� �����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
 */
public class Test01 {
	public static void main(String[] args) {
		
		int[] score;
		score = new int[6];
		
//		5���� ������ ���� �Է��ϰ� 
		for(int i = 0; i < score.length-1; i++) {
			int num = (int)(Math.random() * 41 + 60);
			score[i] = num;
		}
		for(int i = 0; i < score.length - 1; i++) {
			int tmp = score[i];
			int sum = score[score.length - 1];
			score[score.length -1] = sum + tmp;
//			score[score.length - 1] = score[score.length - 1] + score[i];
		}
		 
		// ��� ����ϱ�
		double avg = score[score.length - 1] / (score.length - 1.0);
		
		// ���
		System.out.print("�л��� ���� ���� : ");
		for(int i = 0; i < score.length -1; i++) {
			System.out.print(score[i] + " | ");
		}
		System.out.println();
		
		//���� ���
		int total = score[score.length -1];
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
	}
}
