package day10;

/*
	�غ��� ���̸� ������ ������ ������ �ﰢ���� ���̸� ������ִ� ����� �Լ�(samgak)
	�� ����� �����ϼ���.
*/
public class Test03_01 {
	public Test03_01() {
		samgak();
	}
	public static void main(String[] args) {
		new Test03_01();
	}
	
	void samgak() {
		
		int width = (int)(Math.random() * 9 + 1);
		int height = (int)(Math.random() * 9 + 1);
		
		double area = width * height * 0.5;
		
		System.out.println("�ﰢ���� �غ� : " + width);
		System.out.println("�ﰢ���� ���� : " + height);
		System.out.println("�ﰢ���� ���� : " + area);
	
	}
	
}
