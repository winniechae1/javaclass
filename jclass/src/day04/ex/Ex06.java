package day04.ex;
/*
 	���� 6 ]
	5�ڸ� ���ڸ� �����ϰ� �߻��� ��
	�� �ڸ� ������ ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
	
	�� ]
		�߻��� ���� : 12345
		==>
			��� : 1 + 2 + 3 + 4 + 5
 */
public class Ex06 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * (99999-10000 + 1) + 10000);
		int result = (num/10000 + (num%10000)/1000 + (num%1000)/100 + (num%100)/10 +(num%10));
		
		System.out.println("�߻��� ����:" + num + "���" + result);
	}

}
