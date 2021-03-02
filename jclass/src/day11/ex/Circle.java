package day11.ex;

public class Circle {
	int rad; 
	
	public Circle() {
		rad = (int)(Math.random() * 11 + 5);
	}
	
	public double around() {
		return 2 * Math.PI * rad;
	}
	public double getArea() {
		return Math.PI * rad * rad;
	}
	
	/*
	 	int rad;
	 	double around, area;
	 	
	 	public Circle(){
	 		rad = (int)(Math.random() * 11 + 5);
	 		setAround();
	 		setArea();
		}
		
		public void setAround(){
			around = 2 * Math.PI * rad;
		}
		public void setArea(){
			area =  Math.PI * rad * rad;
		}
	 */
}
