package day10.ex;
/*
 	1. width�� ������ �Է¹޾� �������ִ� �Լ�
 	2. height�� ������ �Է¹޾� �������ִ� �Լ� 
 	3. width �� height�� �̿��ؼ� �簢���� ������ ����ϰ� ��ȯ���ִ� �Լ� 
 	4. ���� 2���� �Է¹޾Ƽ� ������ ���� �Լ��� ����ؼ� �簢���� ���μ��θ� �����ϰ� 
 		������ ������ִ� ����� �Լ� 
 */
public class Ex03 {
	
	int width; 
	int height;
	public Ex03() {
		int no1 = (int)(Math.random() * 9 + 1);
		int no2 = (int)(Math.random() * 9 + 1);
		print(no1, no2);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
	
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int setArea() {
		int area = width * height;
		return area;
	}
	
	public void print(int w, int h) {
		setWidth(w);
		setHeight(h);
		int area = width * height;
		
		System.out.println("�غ� : " + width);
		System.out.println("���� : " + height);
		System.out.println("���� : " + area);
	}
}
