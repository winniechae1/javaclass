package day05_run.ex;
/*
���� 6 ]
	�� ������ �Է¹޾Ƽ�
	�� ������ �ּ� ������� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	���� ]
		�ּҰ������ �� ���� ������ �������� �ּ� ���ڸ� �̾߱��Ѵ�.
		
		2�� 3�� �ּ� ������� 6 �̴�.
		2�� 7�� �ּ� ������� 14�̴�.
		3�� 7�� �ּ� ������� 21�̴�.
		
		12 �� 24�� �ּ� ������� 24�̴�.
		
		2, 7
		==>
			7 
			8
			9
*/
import java.util.*;
public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int no1 = sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int no2 = sc.nextInt();
		
		int max = (no1 > no2) ? no1 : no2;
		int result;
		
		for(int i = max; true; i++) {
			
			if(i%no1 == 0 && i%no2==0) {
				result = i;
				break;
			}
		}
		System.out.println("�� ��" + no1 + "��" + no2 + "�� �ּҰ������" + result);
	}

}
