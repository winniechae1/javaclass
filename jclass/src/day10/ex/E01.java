package day10.ex;
/*
문제1]
	반지름을 정수로 입력하면 입력한 정수를 반지름으로 하는 원의 
	둘레, 넓이를 한꺼번에 반환해주는 함수를 만들고 실행해서 결과를 출력하세요.
	반지름은 15 - 45 사이로 랜덤하게 입력되게 하세요.   
*/
public class E01 {
	public E01() {
		int rad = (int)(Math.random() * 31 + 15);
		double[] result = circle(rad);
		System.out.println("반지름 : " + result[0]);
		System.out.println("둘레 : " + result[1]);
		System.out.println("넓이 : " + result[2]);
		
	}
	public static void main(String[] args) {
		new E01();
	}
	
	double[] circle(int r) {
		
		double[] setC = new double[3];
		setC[0] = r;
		setC[1] = r * 2 * Math.PI;
		setC[2] = r * r * Math.PI;
		return setC;
	}
}
