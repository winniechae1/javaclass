package day10;
/*
 	�� ��(����)�� �Է��ϸ� ���� ����� �˷��ִ� �Լ�(add01)�� �����ϰ� 
 	���ڸ� �����ϰ� ������ �߻����Ѽ� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class Test02 {
	public Test02() {
		// ���� 3���� �����ϰ� ����� 
		int no1 = (int)(Math.random() * 10 + 1);
		int no2 = (int)(Math.random() * 10 + 1);
		int no3 = (int)(Math.random() * 10 + 1);
		
		// �� ���� ��� ����� ���� ������ �غ�
		int result = add01(no1, no2, no3);
		
		// ��� ����ϰ� 
		System.out.println("3���� ���� " + no1 + ", " + no2 + ", " + no3 + "�� ���� ����� " + result + "�Դϴ�.");
	}
	public static void main(String[] args) {
		new Test02();

	}
	
	// �� ���� ���ϴ� ����� �Լ�
	int add01(int a, int b, int c) {
		// ��ȯ�� ���� 
		int result = 0;
		
		// �� �� ����ؼ� ��ȯ�� ������ �����ϰ�
		result = a + b + c;
		
		// ��� ��ȯ�ϰ� 
		return result;
	}

}
