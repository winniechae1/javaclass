package day15;

public abstract class Test07 {
/*
 	�߻�Ŭ������ �߻��Լ��� 0�� �̻� ������ �ִ� Ŭ�����̴�. 
 	���� �߻�Ŭ���� �ȿ��� �߻��Լ��� ���� ���� �ִ�. 
 */
	
	private int num = 1000;

	public int getNum() {	//	�Ϲ��Լ�
		return num;
	}
	public void setNum(int num) {	// �Ϲ��Լ�
		this.num = num;
	}
	
	public abstract int addNum(int no);		//	�߻��Լ�
}
