package day11.ex;
/*
 	����2] 
 		���� ������ ����� Ŭ����(Circle)�� �����ϰ� 
 		�� Ŭ���� 10���� ������ �迭�� ���� 
 		������, �ѷ�, ���̸� ����ϼ���. 
 		
 */
public class Ex02 {
	public Ex02() {
		
		Circle[] circle = new Circle[10];
		for(int i = 0; i < circle.length; i++) {
			circle[i] = new Circle();
		}
		
		for(Circle c : circle) {
			int rad = c.rad;
			double around = c.around();
			double area = c.getArea();
			System.out.printf("������ : %d , �ѷ� : %f , ���� : %f\n" , rad, around, area);
		}
	}
	public static void main(String[] args) {
		new Ex02();

	}

}
