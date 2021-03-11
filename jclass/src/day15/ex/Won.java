package day15.ex;

public class Won extends Figure {
	int rad;
	double round, area;

	public Won(int rad) {
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
		System.out.printf("�������� %2d �� ���� �ѷ��� %5.2f �̰� ���̴� %5.2f �̴�.\n", rad, round, area);
	}

}