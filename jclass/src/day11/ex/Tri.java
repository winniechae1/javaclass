package day11.ex;
/*
	문제3]
		삼각형 5개 기억할 배열을 만들고 
		각 삼각형의 정보를 출력하세요.
		단, 삼각형의 가로 세로 세팅은 함수로 각각 처리하세요.
		(==> 생성자에서 처리하지 않도록 하세요. 출력함수도 삼각형 클래스에서 
			정의해놓고 함수를 호출해서 처리하도록 하세요.)
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
		System.out.printf("삼각형의 가로 : %d  -  세로 : %d\n", width, height);
	}
}



