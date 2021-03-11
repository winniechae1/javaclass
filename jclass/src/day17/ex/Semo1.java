package day17.ex;


public class Semo1 {
	private int width,height;
	private double area;
	
	public Semo1() {
		
	}
	
	public Semo1(int w,int h) {
		setWidth(w);
		setHeight(h);
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
	
	public void setArea() {
		this.area = width * height / 2.0;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String toString() {
		return "�غ� : " + width + ", ���� : " + height + ", ���� : " + area  + "\n";
	}

	public boolean equals(Object obj) {
		boolean bool = false;
		
		Semo1 tmp = (Semo1) obj;
		
		bool = this.area == tmp.area;
		
		return bool;
	}
}