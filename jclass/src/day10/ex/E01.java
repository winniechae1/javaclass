package day10.ex;
/*
����1]
	�������� ������ �Է��ϸ� �Է��� ������ ���������� �ϴ� ���� 
	�ѷ�, ���̸� �Ѳ����� ��ȯ���ִ� �Լ��� ����� �����ؼ� ����� ����ϼ���.
	�������� 15 - 45 ���̷� �����ϰ� �Էµǰ� �ϼ���.   
*/
public class E01 {
	public E01() {
		int rad = (int)(Math.random() * 31 + 15);
		double[] result = circle(rad);
		System.out.println("������ : " + result[0]);
		System.out.println("�ѷ� : " + result[1]);
		System.out.println("���� : " + result[2]);
		
	}
	public static void main(String[] args) {
		new E01();
	}
	
	double[] circle(int r) {
		
		double[] setC = new double[3];
		setC[0] = r;
		setC[1] = r * 2 * Math.PI;
		setC[2] = r * r * Math.PI;
		return setC;
	}
}
