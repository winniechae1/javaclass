package day04.ex;
/*
 	���� 5 ]
	��ǻ�Ϳ� ���������� ������ �� ���α׷��� �����ϼ���.
	
	��ǻ�ʹ� �����ϰ� 1 ~ 3 ������ ���ڸ� �߻��ؼ�
		1 - ����
		2 - ����
		3 - ��
	�� �����ϰ�
	����� ���� 1 ~ 3 ������ ���ڸ� �Է��ϵ��� �Ѵ�.
	
	���� �̰���� Ȯ���ϴ� ���α׷��� �ۼ��ϼ���.
	��ǻ�Ͱ� �̱�� -1�� ��ȯ�ϵ����ϰ�
	����ڰ� �̱�� 1�� ��ȯ�ϵ��� �ϰ�
	���� 0�� ��ȯ�ϵ����Ѵ�.
	
	��Ʈ ]
			��ǻ��		����		����		��
		�����	����		0		-1		1
				����		1		0		-1
				��		-1		1		0
 */
import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		int com = (int)(Math.random() * 3 + 1);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int user = sc.nextInt();
		String result = "";
		int sul = (user - com);
		if (sul == -1) { 
			result = ("��ǻ�Ͱ� �̰���ϴ� : " + -1);
		}
		else if (sul == 0) {
			result = ("�����ϴ� : " + 0);
		}
		else if (sul == 1) {
			result = ("����ڰ� �̰���ϴ� : " + 1);
		}
		else 
			result = ("��ǻ�Ͱ� �̰���ϴ� : " + 2);
			
		System.out.println("�����" + user + "��ǻ��" + com + "�����" + result);
	}

}
