package day10;

/*
	�� ��(����)�� �Է��ϸ� ���� ����� �˷��ִ� �Լ�(add01)�� �����ϰ� 
	���ڸ� �����ϰ� ������ �߻����Ѽ� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
*/
public class Test02_01 {
	public Test02_01() {
		int no1 = (int)(Math.random() * 9 + 1);
		int no2 = (int)(Math.random() * 9 + 1);
		int no3 = (int)(Math.random() * 9 + 1);
		
		int result = add01(no1, no2, no3);
		System.out.println("�� ���� ���� " + no1 + " , " + no2 +" , "  + no3 + "�� ����" + result);
	}
	
	public static void main(String[] args) {
		new Test02_01();
	}
	
	int add01(int a, int b, int c) {
		int sum = 0;
		sum = a + b + c;
		return sum;
	}
}
