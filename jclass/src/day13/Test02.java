package day13;

public class Test02 {
	int[] num;
	
	public Test02() {
		//	�⺻������
		num = new int[10];
	}
	
	public Test02(int cnt) {
		num = new int[cnt];
	}
	
	public Test02(int ... no) {
		num = no;
	}
	
	/*
	public Test02(int[] no) {
		//	������ ������ �����μ��� �����ε��� �����ڿ� �Ű� ��������Ʈ�� ���°� �����Ƿ� �����ε��� �ȵȴ�.
	}
	*/
	public void Test02() {
		//	�� ���� �� �Լ��� ������ �Լ��� �ƴϰ� �Ϲ��Լ��� ������ ���̴�.
		//	������ �Լ��� ����� ��ȯ���� ������ �ȵȴ�.
	}
	public static void main(String[] args) {
		new Test02();
	}

}
