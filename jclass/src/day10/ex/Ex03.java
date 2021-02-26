package day10.ex;
/*
 	1. width에 정수를 입력받아 대입해주는 함수
 	2. height에 정수를 입력받아 대입해주는 함수 
 	3. width 와 height를 이용해서 사각형의 면적을 계산하고 반환해주는 함수 
 	4. 정수 2개를 입력받아서 위에서 만든 함수를 사용해서 사각형의 가로세로를 세팅하고 
 		면적을 출력해주는 기능의 함수 
 */
public class Ex03 {
	
	int width; 
	int height;
	public Ex03() {
		int no1 = (int)(Math.random() * 9 + 1);
		int no2 = (int)(Math.random() * 9 + 1);
		print(no1, no2);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
	
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int setArea() {
		int area = width * height;
		return area;
	}
	
	public void print(int w, int h) {
		setWidth(w);
		setHeight(h);
		int area = width * height;
		
		System.out.println("밑변 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("넓이 : " + area);
	}
}
