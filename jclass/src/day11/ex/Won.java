package day11.ex;

public class Won {
	public int rad;
	public double around, area;
	
	public void setRad() {
		rad = (int)(Math.random() * 11 + 5);
	}
	
	public void setAround() {
		around = 2 * rad * Math.PI;
	}
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	public void toPrint() {
		System.out.printf("������ : %2d, �ѷ� : %5.2f , ���� : %5.2f \n", rad, around, area);
	}
}
