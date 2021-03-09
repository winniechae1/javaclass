package day16.ex;

public class Semo implements Dohyung{

	int width;
	int height;
	double area;
	
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
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
	public double getArea() {
		return width * height * 0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		this.area = width * height * 0.5;
	}
	public void toPrint() {
		System.out.printf("�غ��� %2d �̰� ���̰� %2d �̰� ���̰� %5.1f �� �ﰢ��\n", width, height, area);
	}
}
