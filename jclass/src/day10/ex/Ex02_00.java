package day10.ex;

import java.util.Arrays;

/*
 	5������ ������ �����ϰ� �߻����Ѽ� �迭�� ��ȯ���ִ� �Լ��� �ۼ��ϰ� �����ؼ� ����ϼ���.
 	
 	���������� �迭������ ���� �����ϴ� ���� �ƴϴ�. 
 */
public class Ex02_00 {
	/*
	public Ex02_00() {
		int Array[];
		Array = func();
		for(int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}
		
		
	}
	public static void main(String[] args) {
		new Ex02_00();
	}
	
	int[] func() {
		
		int[] score = new int[5];
		for(int i = 0; i < score.length; i++) {
			int num = (int)(Math.random() * 50 + 60);
			score[i] = num;
		}
		return score;
	}
*/	
	public Ex02_00() {
		// 1. ���븸 �ٷ� ���캸�� ���
		System.out.println(Arrays.toString(getScore()));
	
		// 2. ������ ��ȯ���� �����Ѽ� ����ϴ� ���
		int[] score = getScore();
		
		// 3. ���� ���
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}
	public static void main(String[] args) {
		new Ex02_00();
	}
	// �����ϰ� ������ �߻����Ѽ� 5���� ������ ��ȯ���ִ� �Լ� 
	// �Լ��� ��ȯ���� �ϳ��� ��������� �Ѵ�. 
	// ���� Ÿ���� ������ 5���� ������ �� �ִ� Ÿ������ ��ȯ���ָ� �ȴ�.
	// ���� �� ���� ���� 5���� ��ȯ����� �ϱ� ������ ���� �迭�� ��ȯ���ָ� �ȴ�.
	public int[] getScore() {
		// �� �Լ��� �ʿ��� �����͸� �Լ� ���ο��� ó���ϸ� �Ǳ� ������ 
		// �Է� �޾ƾ� �� �����Ͱ� �ʿ����. 
		
		// ��ȯ�� �Լ� ����� 
		int[] score = new int[5];
		
		// �迭 ä���ְ� 
		for(int i = 0; i < score.length; i++) {
			int num = (int)(Math.random() * 50 + 60);
			score[i] = num;
		}
		
		// ������ ��ȯ���ְ� 
		return score;
	}
}
