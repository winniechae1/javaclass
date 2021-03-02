package day11.ex;
/*
 	문제2] 
 		원의 정보를 기억할 클래스(Circle)을 정의하고 
 		이 클래스 10개를 관리할 배열을 만들어서 
 		반지름, 둘레, 넓이를 출력하세요. 
 		
 */
public class Ex02 {
	public Ex02() {
		
		Circle[] circle = new Circle[10];
		for(int i = 0; i < circle.length; i++) {
			circle[i] = new Circle();
		}
		for(int i = 0; i < circle.length; i++) {
			int rad = circle[i].rad;
			double around = circle[i].around();
			double area = circle[i].getArea();
			System.out.printf("반지름 : %d , 둘레 : %f , 넓이 : %f\n" , rad, around, area);
		}
		System.out.println("---------------------------------------------------------------");
		for(Circle c : circle) {
			int rad = c.rad;
			double around = c.around();
			double area = c.getArea();
			System.out.printf("반지름 : %d , 둘레 : %f , 넓이 : %f\n" , rad, around, area);
		}
	}
	public static void main(String[] args) {
		new Ex02();

	}

}
