package day05_run;

/*
	10 ~ 49 ������ ���� ���� �ϳ��� �Է¹޾Ƽ�
		
		10 ~ 19 : �ѹ���
		20 ~ 29 : ������
		30 ~ 39 : ȸ���
		40 ~ 49 : ���ߺ�
	
	�� ��� �ݺ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	99�� �Է��ϴ� ����ǵ��� �ϼ���.
 */
import java.util.*;
public class T02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("�μ���ȣ�� �Է��ϼ��� : ");
		int dno = sc.nextInt();
		
		String dname = "";
		if (dno == 99) {
			System.out.println(dno + "�ش� �μ���ȣ�� �����ϴ�.");
			break;
		}
		switch(dno/10) {
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
			break;
		}
		
		System.out.println(dno + "��" + dname + "�Դϴ�.");
		}
		
		
	}
}
