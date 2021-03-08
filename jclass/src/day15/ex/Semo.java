package day15.ex;

public class Semo extends Figure{
	
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
		return area;
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
