package day11;

public class Test06 {
	
	public Test06() {
		Nemo sagak1 = new Nemo();
		System.out.println("���� - ���� : " + sagak1.garo + " - " + sagak1.sero);	// ��� : ���� - ���� : 0 - 0  �����ڿ� ���� �ڵ� �ʱ�ȭ
		sagak1.garo = 2;
		sagak1.sero = 3;
		System.out.println("���� - ���� : " + sagak1.garo + " - " + sagak1.sero);
		Nemo sagak2 = new Nemo();
		System.out.println("sagak1�� ���� : " + sagak1.getArea());
		
		//	2�ܰ� - �迭�� ����� ����.
		Nemo[] nemo = new Nemo[3];	//	�� ���´� 3��¥�� �׸� ����� �游 ����� ���� �����̴�. 
		//	�� �迭�� ���������� ����Ϸ��� �� �濡 �׸� ���� �׸��� �ν��Ͻ��� ��������� �Ѵ�.
//		System.out.println("ù��° �׸��� ���� : " + nemo[0].garo);	//	���� �迭�� �濡 �����Ͱ� ������ ���� �ʾƼ� ������ �߻��Ѵ�.
		/*
		for(int i = 0; i < nemo.length; i++) {
			nemo[i] = new Nemo();
		}
		*/
		
		nemo[0] = new Nemo();
		nemo[1] = new Nemo();
		nemo[2] = new Nemo();
		
		System.out.println("ù��° �׸��� ���� : " + nemo[0]);
		
		
	}
	
	public static void main(String[] args) {
		new Test06();
	}

}
