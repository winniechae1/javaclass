package day07;

import java.util.*;
// ���� ����
public class Test07 {

	public static void main(String[] args) {
		// �迭 �ϳ��� �����
		int[] no1 = {1, 2, 3, 4, 5 };
		// ���� ���
		System.out.println(Arrays.toString(no1));
		
		// ������� �迭�� �����.
		int[] no2 = new int[3];
		// ���� ����� �迭�� �Ϻκи� �����Ѵ�. 
		System.arraycopy(no1, 1, no2, 0, 3);
		System.out.println(Arrays.toString(no2));
		
		// no1�� ����° ���� �����͸� 8�� �ٲ۴�.
		no1[2] = 8;
		System.out.println("--------------------------------------------");
		System.out.println(Arrays.toString(no1));
		System.out.println(Arrays.toString(no2));

	}

}
