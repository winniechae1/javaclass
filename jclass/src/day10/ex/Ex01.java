package day10.ex;


/*
 문제1]
 	반지름을 정수로 입력하면 입력한 정수를 반지름으로 하는 원의 
 	둘레, 넓이를 한꺼번에 반환해주는 함수를 만들고 실행해서 결과를 출력하세요.
 	반지름은 15 - 45 사이로 랜덤하게 입력되게 하세요.   
 */
public class Ex01 {
	public Ex01() {
		// 반지름 랜덤하게 만들고 
		int rad = (int)(Math.random() * 31 + 15);
		// 만들어진 숫자를 반지름으로 하는 원의 정보 배열 만들고
		double[] circle = setCircle(rad);
		// 만들어진 배열 출력하고 
		System.out.println("원의 반지름" + circle[0]);
		System.out.println("원의 둘레" + circle[1]);
		System.out.println("원의 넓이" + circle[2]);
	}
	public static void main(String[] args) {
		new Ex01();

	}
	// 원의 정보를 기억하는 배열을 반환해주는 함수 
	public double[] setCircle(int r) {
		// 반환값 변수 
		double[] result = new double[3];
		result[0] = r;
		result[1] = 2 * r * Math.PI;
		result[2] = r * r * Math.PI;
		return result;
	}
	
	/*
	void setCircle() {
		int rad = (int)(Math.random() * 31 + 15);
		double circ = 2 * rad * 3.14;
		double area = 3.14 * rad * rad;
		
		System.out.println("반지름이 " + rad + " 인 원의 둘레는 " + circ + " 넓이는" + area + " 입니다.");
	}
	*/
}
