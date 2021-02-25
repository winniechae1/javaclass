package day05_run.ex;
/*
���� 2 ]
	�ټ��ڸ��� ���ڸ� �����ϰ� �߻���Ų��
	���ڸ��� ���� �����ִ� ���α׷��� �ۼ��ϼ���.
	��, �ݺ����� ����ؼ� ó���ϼ���.
	
	��Ʈ 1 ]
		charAt() - ���ڿ��� Ư����ġ�� ���ڸ� �����ִ� �Լ�
		Integer.parseInt() - ���������� ���ڿ��� ������ 
								��ȯ�����ִ� �Լ�
	
	��Ʈ2 ]
		������ 10 ������ ���ڸ��� �پ���.
		==>
		12345 ---->
					12345 / 10 ===> 1234
					12345 % 10 ===> 5
*/
public class Ex02 {
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * (99999-10000+1)+10000);
		int sum = 0;
		
		int tmp = num;
		for(int i = 0; i < 5; i++) {
			sum = sum + (tmp%10);
			tmp = tmp/10;
		}
		System.out.println("�����ϰ� �߻��� ���� : " + num);
		System.out.println("�� �ڸ��� �� : " + sum);
		
	}
}
