package day10;
	

public class Test01 {
		/*
		 	����]
		 		static(�����Ӽ�)
		 		>> ���� �׸��� �Լ��� ���� �� �ִ� �Ӽ��̴�.
		 			
		 			Ư¡]
		 				static �Լ������� static ����� ȣ���� �� �ִ�. 
		 				
		 */
	int num1 = 100;
//	System.out.println(num1);	--> class ��� �ٷ� �Ʒ������� �Ϲ� ����� �����ϸ� �ȵȴ�. 
		
	public Test01() { // �⺻ ������ �Լ�
		num1 = 200;
//		System.out.println(num1);
		int[] result = calc(2,5);
		calc(10,5); // �Լ��� �������� ������� ���� ���� ������ ����Ű�� �ʴ� ��쵵 �ִ�.
		
		System.out.println("2�� 5�� + ���� : " + result[0]);
		System.out.println("2�� 5�� - ���� : " + result[1]);
		System.out.println("2�� 5�� * ���� : " + result[2]);
		System.out.println("2�� 5�� / ���� : " + result[3]);
		System.out.println("2�� 5�� % ���� : " + result[4]);
	}
	public static void main(String[] args) {
		new Test01();
		/*
		 	static �Լ� �������� static ���(����, �Լ�)�� �޸𸮿� �÷��� �͸� ����� �� �ִ�.
		 */
	}
	// �� ���� �Է¹޾Ƽ� +, -, *, /, % ������ ����� �˷��ִ� �Լ��� �����ϰ� �����ϼ���.
	
	// �� �� ������ִ� �Լ� 
	int[] calc(int a, int b) {
		// ��ȯ�� ���� ���� 
		int[] no = new int[5];
		
		// +, -, *, /, % ������� ������� �迭�� �ִ´�.
		no[0] = a + b;
		no[1] = a - b;
		no[2] = a * b;
		no[3] = (b == 0) ? 0 : a / b;
		no[4] = a % b;
		return no;
//		System.out.println("no" + no); ==> �� ���� ����� ����Ǵ� ��찡 ����. return ��ɿ��� �̹� �Լ��� ����Ʊ� �����̴�.
		/*
		 	return �� �Լ����� ����ϴ� ��ɾ� 
		 	�ǹ̴� ���� ���� ���� �Լ��� ��� �����ϼ���.
		 	���� ��ȯ���� ������ ��ȯ���� ��ȯ�ϰ� ��� �����ϼ���.
		 	�� �ǹ��̴�.
		 */
	}
}
