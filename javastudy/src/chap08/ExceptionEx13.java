package chap08;

public class ExceptionEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}
	static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	}
}
