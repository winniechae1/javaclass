package day03;

public class Test04 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 20;
		
		System.out.println("no1 > no2 : " + (no1 > no2));
		// �� �����ڴ� ���տ����ں��� �켱������ ����.
		// ���� ���� ������ �Ǵ� ��� �����ڿ� ȥ���ؼ� ����� ���� () �̿��ؼ� 
		// ������ �����ؼ� ����ó���� ������Ѵ�.
		System.out.println("(no1 >= 10) & (no2 == 20) : " + ((no1 >= 10) & (no2 == 20)));
		System.out.println("(no1 == 10) & (no2 > 20) : " + ((no1 == 10) & (no2 > 20)));
		System.out.println("(no1 == 10) | (no2 > 20) : " + ((no1 == 10) | (no2 > 20)));
	}
}
