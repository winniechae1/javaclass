package day05.ex;

import java.util.Scanner;

/*
	���� 6 ]
		�� ������ �Է¹޾Ƽ�
		�� ������ �ּ� ������� ������ִ� ���α׷��� �ۼ��ϼ���.
		
		���� ]
			�ּҰ������ �� ���� ������ �������� �ּ� ���ڸ� �̾߱��Ѵ�.
			
			2�� 3�� �ּ� ������� 6 �̴�.
			2�� 7�� �ּ� ������� 14�̴�.
			3�� 7�� �ּ� ������� 21�̴�.
 */
import java.util.*;
public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� :");
		int num1 = sc.nextInt();
		System.out.print("������ �Է��ϼ��� :");
		int num2 = sc.nextInt();
		int i = 1;
		int max=0;
		while(i < num1 && i < num2) {
			if(num1%i ==0 && num2%i ==0) {
				max = i;
			}
					i++;
			}
		int min = (num1*num2)/(max*max)*max; 
		System.out.println("�ִ�������" + max);
		System.out.println("�ּҰ������" + min);
}

	}


