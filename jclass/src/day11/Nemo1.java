package day11;

public class Nemo1 {
	public int garo, sero;
	
	//	���μ��ΰ� �����ϰ� ������ �Ǵ� �⺻ ������
	public Nemo1() {
		garo = (int)(Math.random() * 15 + 1);
		sero = (int)(Math.random() * 15 + 1);
	}
	
	//	���� ���θ� �̿��ؼ� ������ ��ȯ���ִ� �Լ� 
	public int getArea() {
		return garo * sero;
	}
}
