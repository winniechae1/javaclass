package day03;
/*
 	���� 5]
 		25 ~ 95 ������ ���� �ϳ��� �����ϰ� �߻� ��Ų ��  �� ���ڿ� 
 		���� ����� 10�� ����� ������ִ� ���α׷��� �ۼ��ϼ���.
 		�߻��� ���ڿ� ����� 10�� ����� ��� ����ϼ���. 
 		��]
 			27 >> 30�� ���� ����� 10�� ��� 
 			32 >> 30�� ���� ����� 10�� ��� 
 			
 */
public class Ex05 {

	public static void main(String[] args) {
		int lo = 25;
		int hi = 95;
		
		int num = (int)(Math.random() * (hi - lo + 1) + lo);
		System.out.println("25 ~ 95 ������ ���� ���� : " + num);
		
		System.out.println("�߻��� ���� : " + ((num % 10 >= 5) ? (((num/10) + 1) * 10 ) : ((num/10) * 10)));
		
	}

}
