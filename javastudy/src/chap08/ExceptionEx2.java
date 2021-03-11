package chap08;
/*
  	예외처리 : 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
  				프로그램의 비정상 종료를 막고, 정상적인 실행 상태를 유지하는 것
  	[예제8-3]
 */
public class ExceptionEx2 {
/*
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			result = number / (int)(Math.random() * 10);
			System.out.println(result);
		}
	}
*/
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0");
			}
		}
	}
}
