package day13;

public class Test03 {
	int num = 10;
	
	public Test03(int no) {
		num = no;
	}
	
	public static void main(String[] args) {
//		Test03 t1 = new Test03();	
		/*
		 	������ �Լ��� �Ѱ��� ����� �ڹ� ����ӽ��� �⺻ �����ڸ� ��������� �ʴ´�.
		 	���� ������ �߻��Ѵ�.
		 */
		Test03 t1 = new Test03(500);
		System.out.println("Test03.num : " + t1.num);
	}

}
