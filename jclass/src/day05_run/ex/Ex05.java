package day05_run.ex;
/*
���� 5 ]
	�ΰ��� ������ �Է¹޾Ƽ�
	�μ��� �ִ� ������� ������ִ� ���α׷��� �����ϼ���.
	
	���� ]
		�ִ� ����� ]
			�μ��� ���� �� �ִ� ���� ���� ū ��..
			
			�� ]
				6 �� 8�� �ִ� ������� 2�̴�.
				6 �� 9�� �ִ������� 3�̴�.
*/
import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		int max = (num1 > num2) ? num1 : num2;
		int result;
		for(int i = max; true; i--) {
			if (num1%i==0 && num2%i==0) {
				result = i;
				break;
			}
		}
		System.out.println("�� �� " + num1 + "��" + num2 + "�� �ִ�������" + result);

	}

}
