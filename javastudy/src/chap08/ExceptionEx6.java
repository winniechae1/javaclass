package chap08;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	//	ArithmeticException �� �߻���Ű���� �̰��� ExceptionŬ������ �ڼ��̹Ƿ� catch �� ����ȴ�.
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
