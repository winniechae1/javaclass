package day11;

public class Test07 {

	public Test07() {
		/*
		Nemo1 n1 = new Nemo1();
		Nemo1 n2 = new Nemo1();
		
		System.out.println("n1 ���� - ���� : " + n1.garo + " - " + n1.sero);
		System.out.println("n2 ���� - ���� : " + n2.garo + " - " + n2.sero);
		*/
		
		// 5���� Nemo�� ������ �迭�� ����� �� �׸��� ������ ����غ���.
		Nemo1[] nemo = new Nemo1[5];	
		//	�� ���´� Nemo1�� �ν��Ͻ��� ����� �� 5���� �غ��س��� �����̰� �� �濡�� 
		//	�ν��Ͻ��� ä������ ���� �����̴�. ���� �� �濡 �ν��Ͻ��� ���� �����Ѿ� �Ѵ�.
		/*
		 	nemo[0] = new Nemo1();
		 	nemo[1] = new Nemo1();
		 	nemo[2] = new Nemo1();
		 	nemo[3] = new Nemo1();
		 	nemo[4] = new Nemo1();
		 */
		for(int i = 0; i < nemo.length; i++) {
			nemo[i] = new Nemo1();
		}
		
		//	�ν��Ͻ��� ä�������� �� Nemo1���� ���μ��ΰ� ������ �ư� ������ ����غ���.
		for(int i = 0; i < nemo.length; i++) {
			int garo = nemo[i].garo;
			int sero = nemo[i].sero;
			int area = nemo[i].getArea();
			System.out.printf("���� : %2d | ���� : %2d | ���� : %3d\n ", garo, sero, area);
		}
		System.out.println("-------------------------------------------------------------");
		// ���� for������� ó���ϴ� ���
		for(Nemo1 n : nemo) {
			int garo = n.garo;
			int sero = n.sero;
			int area = n.getArea();
			System.out.printf("���� : %2d | ���� : %2d | ���� : %3d\n ", garo, sero, area);
		}
	
	}
	public static void main(String[] args) {
		new Test07();
	}

}
