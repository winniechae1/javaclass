package day13.ex;
/*
���� 2 ]
	1. �� ����( int x, int y)�� ����ϴ� Ŭ���� MyPoint�� �ۼ��ϰ�
	2. ����ڰ� �� Ŭ������ new ��ų�� �ִ� ������ �Լ��� �����
		1) �⺻ �������Լ�
		2) �� ���� �˷��ָ� �� ���� x, y�� ����ϴ� ������ �Լ�
		3) �μ��� �迭�� �˷��ָ�
			�� ���� x, y�� ����ϴ� ������ �Լ�
	3. �Լ� �߰�
		1) x ���� �������ִ� �Լ�
		2) y ���� �������ִ� �Լ�
		3) x, y�� ���ÿ� �������ִ� �Լ�
		4) x ���� �������� �Լ�
		5) y ���� �������� �Լ�
		6) x�� y ���� ������ִ� �Լ�(display)
*/
public class MyPoint {
	
	private int x, y;
	
	public MyPoint() {
		
	}
	public MyPoint(int a, int b) {
		x = a;
		y = b;
	}
	
	public MyPoint(int[] a) {
		/*
		x = a[0];
		y = a[1];
		*/
		this(a[0],a[1]);
	}
	public void setX(int a) {
		x = a;
	}
	public void setY(int b) {
		y = b;
	}
	public void setXY(int a, int b) {
//		this(a,b);
//		this()�� �������Լ������� ����� �� �ְ� �� ù�������� ����ؾ� �Ѵ�.
		/*	�� ����� ����
		setX(a);
		setY(b);
		*/
		x = a;
		y = b;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void display() {
		System.out.println("x : " + x + ", y :" + y);
	}
	
	
}
