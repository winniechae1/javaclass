package day10.ex;

/*
	5������ ������ �����ϰ� �߻����Ѽ� �迭�� ��ȯ���ִ� �Լ��� �ۼ��ϰ� �����ؼ� ����ϼ���.
	
	���������� �迭������ ���� �����ϴ� ���� �ƴϴ�. 
*/
public class E02 {
	
	public E02() {
		int[] ret = getScore();
		for(int i = 0; i < ret.length; i++) {
			System.out.print(ret[i] + " ");
		}
	}
	public static void main(String[] args) {
		new E02();
	}
	
	public int[] getScore() {
		
		int[] score = new int[5];
		for(int i = 0; i < score.length; i++) {
			int num = (int)(Math.random() * 40 + 60);
			score[i] = num;
		}
		return score;
	}
}
