package day10.ex;

/*
���� 5 ]
	�� ���� �̿��ؼ� ���ϴ� ���α׷��� �ۼ��ϼ���.
		
		1. �� ������ �Է��ϸ� �� ���� ������ ������ ���ڸ� ��ȯ���ִ� �Լ� (5 ~ 15)
		2. ���� �ΰ��� �Է��ϸ� ������ ���� ��ȯ���ִ� �Լ�
		3. ������ִ� �Լ�
		
	������ ���� �Լ��� �̿��ؼ� ����ϼ���.
 */
public class Ex05 {
	public Ex05() {
//		toPrint(getNum(10,20), getNum(10,20));
		int no1 = getNum(10,20);
		int no2 = getNum(10,20);
		toPrint(no1, no2);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
	// 1. ������ ���ڸ� ��ȯ���ִ� �Լ� 
	
	public int getNum(int max, int min) {
		int result = (int)(Math.random() * (max - min + 1) + min);
		return result;
	}
	// 2. ���� �ΰ��� �Է��ϸ� ������ ���� ��ȯ���ִ� �Լ�
	public int Sum(int no1, int no2) {
		int result = no1 + no2;
		return result;
	}
	
	public void toPrint(int no1, int no2) {
		System.out.println(no1 + " + " + no2 + " = " + Sum(no1,no2));
	}

}
