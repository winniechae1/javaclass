package day10;

//�� ���� �Է¹޾Ƽ� +, -, *, /, % ������ ����� �˷��ִ� �Լ��� �����ϰ� �����ϼ���.
public class Test01_01 {
	public Test01_01() {
		int[] result = calc(2,5);
		System.out.println("2�� 5�� + ���� : " + result[0]);
		System.out.println("2�� 5�� - ���� : " + result[1]);
		System.out.println("2�� 5�� * ���� : " + result[2]);
		System.out.println("2�� 5�� / ���� : " + result[3]);
		System.out.println("2�� 5�� % ���� : " + result[4]);
		
	}
	
	public static void main(String[] args) {
		new Test01_01();
	}
	
	int[] calc(int a, int b) {
		
		int[] no = new int[5];
		
		no[0] = a + b;
		no[1] = a - b;
		no[2] = a * b;
		no[3] = (b == 0) ? 0 : a / b;
		no[4] = a % b;
		
		return no;
	}
}
