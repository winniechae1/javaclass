package chap08;
/*
  	����ó�� : ���α׷� ���� �� �߻��� �� �ִ� ������ �߻��� ����� �ڵ带 �ۼ��ϴ� ��
  				���α׷��� ������ ���Ḧ ����, �������� ���� ���¸� �����ϴ� ��
  	[����8-3]
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
