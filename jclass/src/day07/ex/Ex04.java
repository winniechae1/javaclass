package day07.ex;
/*
 	������ 5���� ����� ��
	������ �������� ���� ���� ���̸� ����ϴ� ���α׷���
	�ۼ��ϼ���.
	���� ���� ���� �迭�� ����ϰ� �ִٰ� �ѹ��� ����ϵ��� �ϼ���.
	==>		float[]	area;
 */
public class Ex04 {
	public static void main(String[] args) {
		float[] rad = new float[5];
		float[] area = new float[rad.length];
		
		for(int i = 0; i < 5; i++) {
			float num = (float)(Math.random() * 5 + 1);
			rad[i] = num;
			float tmp = (float)(num * 3.14);
			area[i] = tmp;
			System.out.println("�������� ���� : " + num + "���� ���� : " + tmp);
		}
		
	}
}
