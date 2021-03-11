package day17;

public class Circle {
	private int rad;
	private double around, area;
	
	public Circle() {
		
	}
	public Circle(int rad) {
		setRad(rad);
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
		setAround();
		setArea();
	}
	public double getAround() {
		return around;
	}
	public void setAround() {
		this.around = 2 * rad * Math.PI;
	}
	public void setAround(double around) {
		this.around = around;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = rad * rad * Math.PI;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public String toString() {
		return "반지름이 " + rad + " 이고 둘레가" + around + "이고 면적은" + area + "인 원";
		
	}
	// 우리는 이 클래스가 객체가 되었을 때 반지름이 같으면 같은 원으로 처리하고 싶다.
		// 이 경우 equals()를 오버라이드해서 반지름을 비교해서 반환해주도록 해주면 된다.
		public boolean equals(Object obj) {
			// 반환값 변수 만들고
			boolean bool = false;
			
			/*
				이 부분에서 bool 의 데이터를 만들어서 반환해주면 되는데
				
				방법은
					우리가 이함수를 사용할 때는
						circle1.equals(circle2)
					이런 형태로 사용하는데 이때 각 객체의 멤버변수중 rad 를 비교해서
					그 값이 같으면 true를 반환해주고 
					다르면  false를 반환해주면 되겠다.
			 */
			
			// 1. 먼저 매개변수를 이 클래스타입으로 강제 형변환을 해준다.
			Circle tmp = (Circle) obj;
			
			// 2. 현재 실행중인 객체의 멤버 rad와 매개변수로 입력된 객체의 멤버 rad를 비교해준다.
			bool = this.rad == tmp.rad;
			// 반환해주고
			return bool;
		}
}
