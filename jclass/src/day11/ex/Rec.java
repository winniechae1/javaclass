package day11.ex;

public class Rec {
	public int garo, sero;
	
	public void setGaro() {
		garo = (int)(Math.random() * 11 + 5);
	}
	public void setSero() {
		sero = (int)(Math.random() * 11 + 5);
	}
	
	public void toPrint() {
		System.out.printf("�簢���� ���� : %d  -  ���� : %d \n", garo, sero);
	}
}
