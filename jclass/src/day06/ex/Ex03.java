package day06.ex;
/*
 	5�ڸ� ���ڸ� (10000 ~ 99999) �����ϰ� �߻��� �� 
 	�� �ڸ� ������ ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class Ex03 {
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * (99999-10000+1)+10000);
		int sum = 0;
		int tmp = num;
		for(int i = 0; i<5; i++) {

			sum = sum + (tmp%10);
			tmp = tmp/10;
		}
		System.out.println(num);
		System.out.println("�� �ڸ��� ���� : " + sum);
	}
}
