package day07;

import java.util.Arrays;

/*
 
 	1 ~ 50 ������ ���� 10���� ����� �迭�� ����� 
 	�����ϰ� ������ �Է��� �� �Էµ� �� �� ���� ū ���� 
 	������ִ� ���α׷��� �ۼ��ϼ���.
 	�迭�� ��� ���뵵 ���� ����ϼ���.
 */
public class Test03 {
	public static void main(String[] args) {
//		���� 10���� ����� ������ �����.
		int[] num = new int[10];
//		�迭�� �����ϰ� ������ ä��� 
		for(int i = 0; i < 10; i++) {
			int no = (int)(Math.random() * 50 + 1);
			num[i] = no;
		}
//		���� ū ���� ã�� 
//		���� ù��° �濡 ä���� �����͸� ������ ����Ų��.
		int max = num[0];
//		������ش�.
		for(int i = 1; i < num.length; i++) {
			// �ι�° ����� �����͸� ������ 
			int tmp = num[i];
//			���Ѵ�.
//			tmp�� max���� ũ�� tmp�� max�� ��ü�ϰ� .. 
			max = (max < tmp) ? tmp : max;
		}
//		�迭 ���� ����ϰ� 
		System.out.println(Arrays.toString(num));
//		���� ū �� ����ϰ� 
		System.out.println("���� ū �� :  " + max);
	}
}
