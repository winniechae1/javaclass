package day10.ex;


/*
 ����1]
 	�������� ������ �Է��ϸ� �Է��� ������ ���������� �ϴ� ���� 
 	�ѷ�, ���̸� �Ѳ����� ��ȯ���ִ� �Լ��� ����� �����ؼ� ����� ����ϼ���.
 	�������� 15 - 45 ���̷� �����ϰ� �Էµǰ� �ϼ���.   
 */
public class Ex01 {
	public Ex01() {
		// ������ �����ϰ� ����� 
		int rad = (int)(Math.random() * 31 + 15);
		// ������� ���ڸ� ���������� �ϴ� ���� ���� �迭 �����
		double[] circle = setCircle(rad);
		// ������� �迭 ����ϰ� 
		System.out.println("���� ������" + circle[0]);
		System.out.println("���� �ѷ�" + circle[1]);
		System.out.println("���� ����" + circle[2]);
	}
	public static void main(String[] args) {
		new Ex01();

	}
	// ���� ������ ����ϴ� �迭�� ��ȯ���ִ� �Լ� 
	public double[] setCircle(int r) {
		// ��ȯ�� ���� 
		double[] result = new double[3];
		result[0] = r;
		result[1] = 2 * r * Math.PI;
		result[2] = r * r * Math.PI;
		return result;
	}
	
	/*
	void setCircle() {
		int rad = (int)(Math.random() * 31 + 15);
		double circ = 2 * rad * 3.14;
		double area = 3.14 * rad * rad;
		
		System.out.println("�������� " + rad + " �� ���� �ѷ��� " + circ + " ���̴�" + area + " �Դϴ�.");
	}
	*/
}
