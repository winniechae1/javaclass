package day12;

public class Test04 {
	public Test04() {
		System.out.println("1 ~ 10 ������ �� : " + getSum(1,2,3,4,5,6,7,8,9,10));
	}
	
	//	�ԷµǴ� �������� ���� ��ȯ���ִ� �Լ�
	public int getSum(int ... no) {
		//	�հ踦 ����� ���� 
		int sum = 0;
		//	���� ���
		//	no�� �ڵ� �迭 �����̱� ������ �迭ó�� �ٷ�� �ȴ�.
		for(int i = 0; i < no.length; i++) {
			sum += no[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		new Test04();
	}
}
