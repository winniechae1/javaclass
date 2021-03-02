package day11;

public class Nemo {
	public int garo, sero;
	
	//	가로세로가 랜덤하게 세팅이 되는 기본 생성자
	public Nemo() {
		garo = (int)(Math.random() * 15 + 1);
		sero = (int)(Math.random() * 15 + 1);
	}
	
	//	가로 세로를 이용해서 면적을 반환해주는 함수 
	public int getArea() {
		return garo * sero;
	}

}
