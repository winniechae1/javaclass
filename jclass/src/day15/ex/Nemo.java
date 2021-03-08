package day15.ex;

public class Nemo extends Figure {
	int garo;
	int sero;
	double area;
	public Nemo(int garo, int sero) {
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
	public void setArea(double area) {
		this.area = area;
	}
	public double getArea() {
		return garo * sero;
	}
	public void setArea() {
		this.area = garo * sero;
	}
	public void toPrint() {
		System.out.printf("가로가 %2d 이고 세로가 %2d 인 사각형의 넓이는 %5.0f 이다.\n", garo, sero, area);
	}
}
