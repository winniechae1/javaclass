package day04.ex;
/*
 	10 ~ 49 ������ �� �� ���� �ϳ��� �Է¹޾Ƽ� 
 	
	10 ~ 19 : �ѹ���
	20 ~ 29 : ������
	30 ~ 39 : ȸ���
	40 ~ 49 : ���ߺ�
	�� ������ִ� ���α׷��� �ۼ��ϼ���. 
	
	if ~ else if ���� 
	
	switch ~ case ���� 
	
	�ΰ��� ��� ó���ϼ���.
 */
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		String dname = "";
		
		int first = num / 10;
		/*
		if (first == 1) {
			dname = "�ѹ���";
		}
		else if (first == 2) {
			dname = "������";
		}
		else if (first == 3) {
			dname = "ȸ���";
		}
		else {
			dname = "���ߺ�";
		}
		System.out.println("�Է��� ���� " + num + " �� " + dname + " �� �Ҽӵ� �μ��Դϴ�.");
		*/
		switch (first) {
		case 1:
			dname = "�ѹ���";
			break;
		case 2:
			dname = "������";
			break;
		case 3:
			dname = "ȸ���";
			break;
		default:
			dname = "���ߺ�";
		}
		System.out.println("�Է��� ���� " + num + " �� " + dname + " �� �Ҽӵ� �μ��Դϴ�.");
	}
	}


