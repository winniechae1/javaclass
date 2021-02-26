package day10;

/*
	세 수(정수)를 입력하면 더한 결과를 알려주는 함수(add01)를 정의하고 
	숫자를 랜덤하게 세개를 발생시켜서 결과를 출력하는 프로그램을 작성하세요.
*/
public class Test02_01 {
	public Test02_01() {
		int no1 = (int)(Math.random() * 9 + 1);
		int no2 = (int)(Math.random() * 9 + 1);
		int no3 = (int)(Math.random() * 9 + 1);
		
		int result = add01(no1, no2, no3);
		System.out.println("세 개의 숫자 " + no1 + " , " + no2 +" , "  + no3 + "의 합은" + result);
	}
	
	public static void main(String[] args) {
		new Test02_01();
	}
	
	int add01(int a, int b, int c) {
		int sum = 0;
		sum = a + b + c;
		return sum;
	}
}
