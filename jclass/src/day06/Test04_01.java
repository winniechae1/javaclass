package day06;

import java.util.Arrays;

/*
5���� �޸𸮸� �迭�� �����
�� �ȿ� ������ ����(����)�� �Է��� �� �������.
*/
public class Test04_01 {
	public static void main(String[] args) {
		
		int[] num = new int[5];
		
		num[0] = (int)(Math.random() * 45 + 1);
		num[1] = (int)(Math.random() * 45 + 1);
		num[2] = (int)(Math.random() * 45 + 1);
		num[3] = (int)(Math.random() * 45 + 1);
		num[4] = (int)(Math.random() * 45 + 1);
		
		System.out.println(Arrays.toString(num));
	}
}
