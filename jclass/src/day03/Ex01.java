package day03;
/*
 	���� 1]
 		3�ڸ� ���ڸ� �����ϰ� �߻����Ѽ� 
 		���ڸ� �̸��� ���� ���ڸ� ���� ����ϼ���.
 */
public class Ex01 {

	public static void main(String[] args) {
		int lo = 100;
		int hi = 999;
		
		int num = (int)(Math.random() * ( hi - lo + 1) + lo);
		System.out.println("3�ڸ��� ���� ���� : " + num);
		System.out.println("3�ڸ��� ���� ���� ���� : " + (num/100) * 100);
		

	}

}
