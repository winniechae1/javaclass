package day11;

public class Nemo {
	public int garo, sero;
	
	//	���μ��ΰ� �����ϰ� ������ �Ǵ� �⺻ ������
	public Nemo() {
		garo = (int)(Math.random() * 15 + 1);
		sero = (int)(Math.random() * 15 + 1);
	}
	
	//	���� ���θ� �̿��ؼ� ������ ��ȯ���ִ� �Լ� 
	public int getArea() {
		return garo * sero;
	}

}
