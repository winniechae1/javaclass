package day14.ext;

public class Circle extends Figure {
	private int rad;
	private double round, area;
	public Circle() {
		
	}
	public Circle(int rad) {
		this.rad = rad;
		setRound();
		setArea();
	}
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getRound() {
		return round;
	}
	public void setRound(double round) {
		this.round = round;
	}
	public void setRound() {
		this.round = 2 * Math.PI * rad;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		this.area = Math.PI * rad * rad;
	}
	public void toPrint() {
		System.out.printf("반지름이 %2d 인 원의 둘레는 %5.2f 이고 넓이는 %5.2f 이다.\n", rad, round, area);
	}
	
}
