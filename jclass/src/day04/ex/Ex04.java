package day04.ex;
/*
 	  
���� 4 ]
	�������� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	�������� �뵵���� 
				�ڵ�		�⺻���	�����
		������	1		3800	245
		�����	2		2400	157
		������	3		2900	169
		�����	4		3200	174
		
		������ ���� : �⺻��� + ��뷮 * �����
		
	�뵵 �ڵ�� ��뷮�� �Է¹޾Ƽ� �������� ������ִ� ���α׷��� �ۼ��ϼ���.
	
 */
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�뵵 �ڵ带 �Է��ϼ��� : ");
		int code = sc.nextInt();
		System.out.print("��뷮�� �Է��ϼ��� : ");
		int use = sc.nextInt();
		int fare;
		switch (code) {
		case 1:
			fare = 3800 + (use * 245);
			break;
		case 2:
			fare = 2400 + (use * 157);
			break;
		case 3:
			fare = 2900 + (use * 169);
			break;
		default:
			fare = 3200 + (use * 174);
			break;
		}
		System.out.println("�ڵ��ȣ" + code + " ��뷮" + use + "�� �����" + fare + "�Դϴ�.");

	}

}
