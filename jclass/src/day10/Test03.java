package day10;

/*
 	�غ��� ���̸� ������ ������ ������ �ﰢ���� ���̸� ������ִ� ����� �Լ�(samgak)
 	�� ����� �����ϼ���.
 */
public class Test03 {
	
	public Test03() {
		// �ﰢ�� �Լ� ȣ��
		samgak();
	}
	public static void main(String[] args) {
		new Test03();

	}
	
	void samgak() {
		// �����ϰ� �غ��� ���� �����
		int width = (int)(Math.random() * 21 + 5);
		int height = (int)(Math.random() * 21 + 5);
		
		// ���� ����ϱ�
		double area = width * height * 0.5;
		
		// ����ϱ�
		System.out.println("�غ� : " + width);
		System.out.println("���� : " + height);
		System.out.println("���� : " + area);
		
//		return;
	}

}
