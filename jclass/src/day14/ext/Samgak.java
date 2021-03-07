package day14.ext;

public class Samgak extends Figure {
	private int width, height;
	private double area;
	
	public Samgak() {
	
	}
	public Samgak(int width, int height) {	//	�⺻������ �����ε�
		this.width = width;
		this.height = height;
		// �ﰢ���� �غ��� ���̰� �������� ������ ����� �ǹǷ� ���⼭ ó������
		setArea();
		
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//	getArea() �� �������̵�
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {	// setArea() �����ε�;
		this.area = width * height * 0.5;	
	}
	
	public void toPrint() {	//	Figure.toPrint() �������̵�(�Լ��� ������)
		System.out.printf("�غ��� %2d �̰� ���̰� %2d �̰� ���̰� %5.1f �� �ﰢ��\n", width, height, area);
	}
	
}
