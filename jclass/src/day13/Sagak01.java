package day13;

public class Sagak01 {
	private int width, height, area;
	public Sagak01() {
		//	�⺻ �����ڰ� ȣ��Ǿ ��ü�� ��������� ���� 
		//	5 ~ 20 ������ ������ ���μ��ΰ� ������ �Ǿ �簢���� �����������
		//	�⺻�����ڿ��� �����غ���.
		/*
		width = (int)(Math.random() * 16 + 5);
		height = (int)(Math.random() * 16 + 5);
		setArea();
		*/
//		Sagak01((int)(Math.random() * 16 + 5),(int)(Math.random() * 16 + 5));
//		System.out.println("### ����� Sagak01 ###");	// this() ������ ����� ���� ������ �߻��Ѵ�. 
		this((int)(Math.random() * 16 + 5),(int)(Math.random() * 16 + 5));
		System.out.println("### ����� Sagak01 ###");
	}
	
	public Sagak01(int w, int h) {
		width = w;
		height = h;
		setArea();
		toPrint();
	}
	
	public void setArea() {
		area = width * height;
	}
	public void toPrint() {
		System.out.printf("���� : %2d, ���� : %2d, ���� : %3d\n", width, height, area);
	}
	public static void main(String[] args) {
		new Sagak01();
	}

}
