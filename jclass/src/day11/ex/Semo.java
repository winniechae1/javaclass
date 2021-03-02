package day11.ex;

public class Semo {
	int width, height;
	public Semo() {
		width = (int)(Math.random() * 11 + 5);
		height = (int)(Math.random() * 11 + 5);
	}
	public double getArea() {
		return width * height * 0.5;
	}
}
