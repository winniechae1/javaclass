package day10.ex;
/*
���� 4 ]
	1. ������ �Է��ϸ� �� ������ �ش��ϴ� 
		�ﰢ�� �迭�� ����� �迭�� ��ȯ���ִ� �Լ�
	2. �迭�� �Է��ϸ� �迭�� �ﰢ������ 
		�غ�, ���� �� �����ϰ� �������ִ� �Լ�
	3. �迭�� �Է��ϸ� �迭�� �ﰢ������ 
		���̸� �Է����ִ� �Լ�
	4. �迭�� �Է��ϸ� �迭�� �ﰢ������ ������ ������ִ� �Լ�
		�غ� - 0000
		���� - 0000
		���� - 0000
	5. �迭�� ������ �Է��ϸ� �迭�� ���� ��ġ�� �ﰢ����
		������ ������ִ� �Լ�
		
	�� ���� �����ϼ���.
 */
public class Ex04 {
	
	public Ex04() {
		int cnt = (int)(Math.random() * 9 + 1);
		double[][] tri = getTri(cnt);
		setArray(tri);
		setArea(tri);
		setPrint(tri);
	}
	public static void main(String[] args) {
		new Ex04();
	}
	
	public double[][] getTri(int cnt){
		double[][] tri = new double[cnt][3];
		return tri;
	}
	public void setArray(double[][] tri) {
		for(int i = 0; i < tri.length; i++) {
			for(int j = 0; j < tri[i].length; j++) {
				int num = (int)(Math.random() * 41 + 10);
				tri[i][j] = num;
			}
		}
	}
	public void setArea(double[][] tri) {
		for(int i = 0; i < tri.length; i++) {
			tri[i][2] = tri[i][0] * tri[i][1] * 0.5;
		}
	}
	public void setPrint(double[][] tri) {
		for(int i = 0; i < tri.length; i++) {
				System.out.println("�غ� : " + tri[i][0] + "���� : " + tri[i][1] + "���� : " + tri[i][2] );
			
		}
	}
}
