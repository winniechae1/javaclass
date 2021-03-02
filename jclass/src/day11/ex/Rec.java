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
		System.out.printf("사각형의 가로 : %d  -  세로 : %d \n", garo, sero);
	}
}
