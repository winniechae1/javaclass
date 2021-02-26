package day10;

/*
	밑변과 높이를 랜덤한 정수로 가지는 삼각형의 넓이를 출력해주는 기능의 함수(samgak)
	를 만들고 실행하세요.
*/
public class Test03_01 {
	public Test03_01() {
		samgak();
	}
	public static void main(String[] args) {
		new Test03_01();
	}
	
	void samgak() {
		
		int width = (int)(Math.random() * 9 + 1);
		int height = (int)(Math.random() * 9 + 1);
		
		double area = width * height * 0.5;
		
		System.out.println("삼각형의 밑변 : " + width);
		System.out.println("삼각형의 높이 : " + height);
		System.out.println("삼각형의 넓이 : " + area);
	
	}
	
}
