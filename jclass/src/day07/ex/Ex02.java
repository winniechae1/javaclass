package day07.ex;

import java.util.Arrays;

/*
 	����2]
 		���� 10���� ����� �迭�� ����� 
 		�� �迭��  0 ~ 9 ������ ���� 100���� �߻����Ѽ� �߻��� ������ 
 		Ƚ���� ����Ű�� ����� ����ϼ���.
 		
 */
public class Ex02 {

	public static void main(String[] args) {
		int [] num = new int[10];
		
		for(int i = 0; i < 100; i++) {
			int no = (int)(Math.random() * 10);
			num[no]++;
		}
		System.out.print(Arrays.toString(num));
		
		for(int j = 0; j < num.length; j++) {
			System.out.print(j + "  :  ");
			for(int k = 0; k < num[j]; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		


	}

}
