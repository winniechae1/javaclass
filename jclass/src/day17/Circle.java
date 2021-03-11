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
		return "�������� " + rad + " �̰� �ѷ���" + around + "�̰� ������" + area + "�� ��";
		
	}
	// �츮�� �� Ŭ������ ��ü�� �Ǿ��� �� �������� ������ ���� ������ ó���ϰ� �ʹ�.
		// �� ��� equals()�� �������̵��ؼ� �������� ���ؼ� ��ȯ���ֵ��� ���ָ� �ȴ�.
		public boolean equals(Object obj) {
			// ��ȯ�� ���� �����
			boolean bool = false;
			
			/*
				�� �κп��� bool �� �����͸� ���� ��ȯ���ָ� �Ǵµ�
				
				�����
					�츮�� ���Լ��� ����� ����
						circle1.equals(circle2)
					�̷� ���·� ����ϴµ� �̶� �� ��ü�� ��������� rad �� ���ؼ�
					�� ���� ������ true�� ��ȯ���ְ� 
					�ٸ���  false�� ��ȯ���ָ� �ǰڴ�.
			 */
			
			// 1. ���� �Ű������� �� Ŭ����Ÿ������ ���� ����ȯ�� ���ش�.
			Circle tmp = (Circle) obj;
			
			// 2. ���� �������� ��ü�� ��� rad�� �Ű������� �Էµ� ��ü�� ��� rad�� �����ش�.
			bool = this.rad == tmp.rad;
			// ��ȯ���ְ�
			return bool;
		}
}
