package day07.ex;

import java.util.Arrays;

/*
 	����1]
 		���� 10���� ����� �迭�� ����� 
 		�����ϰ� 1 ~ 50 ������ ������ �߻����Ѽ� �Է��ϰ�
 		�߻��� �� �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class Ex01 {
	public static void main(String[] args) {
		int num[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			int no = (int)(Math.random() * 50 + 1);
			num[i] = no;
		}
		int min = num[0];
		
		for(int i = 1; i < num.length; i++) {
			int tmp = num[i];
			min = (min < tmp ? min : tmp);
		}
		System.out.println(Arrays.toString(num));
		System.out.println("���� ���� �� : " + min);
	}
}
