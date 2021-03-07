package day14.ext;

public class Rectangle extends Figure{
	private int garo, sero;
	private double area;
	public Rectangle() {
		
	}
	public Rectangle(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		this.area = garo * sero;
	}
	
	public void toPrint() {
		System.out.printf("���ΰ� %2d �̰� ���ΰ� %2d �� �簢���� ���̴� %5.0f �̴�.\n", garo, sero, area);
	}

}
