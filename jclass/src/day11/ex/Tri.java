package day11.ex;
/*
	����3]
		�ﰢ�� 5�� ����� �迭�� ����� 
		�� �ﰢ���� ������ ����ϼ���.
		��, �ﰢ���� ���� ���� ������ �Լ��� ���� ó���ϼ���.
		(==> �����ڿ��� ó������ �ʵ��� �ϼ���. ����Լ��� �ﰢ�� Ŭ�������� 
			�����س��� �Լ��� ȣ���ؼ� ó���ϵ��� �ϼ���.)
*/
public class Tri {
	int width, height;
	public int garo() {
		width = (int)(Math.random() * 11 + 5);
		return width;
	}
	
	public int sero() {
		height = (int)(Math.random() * 11 + 5);
		return height;
	}
	
	public void toPrint() {
		System.out.printf("�ﰢ���� ���� : %d  -  ���� : %d\n", width, height);
	}
}



