package day15;

public class Hap {

	public Hap() {
		System.out.println(hap(10));
	}
	public static void main(String[] args) {
		new Hap();
	}
	/*
	 	���(ȣ��)�Լ�
	 	:	�Լ� ���ο��� �ٽ� �Լ� �ڽ��� ȣ���ϴ� �Լ� 
	 	
	 	���ǻ���]
	 		�̷� ��� �ݵ�� �Լ� ������ ���� ������ �������� �Ѵ�.
	 */
	public int hap(int no) {
		if(no == 0)
			return 0;
		return no + hap(no -1);
	}


}
