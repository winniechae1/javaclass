package day03;
/*
 	�� �ڸ� ���ڸ� �����ϰ� �߻����Ѽ� 
 	���� �ڸ� ������ ������ִ� ���α׷��� �ۼ��ϼ���.
 	��, if else if ������ ����ؼ� ó���ϼ���. 
 	��]	
 		34 -> ���� �ڸ��� 3�� �����Դϴ�. 
 */
public class Test12 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 90 + 10);
		String result = "";
		if (num >= 90) {
			result = "9";
		}
		else if (num >= 80 /* && num < 90 */) {
				result = "8";
		}
		else if (num >= 70) {
			result = "7";
		}
		else if (num >= 60) {
			result = "6";
		}
		else if (num >= 50) {
			result = "5";
		}
		else if (num >= 40) {
			result = "4";
		}
		else if (num >= 30) {
			result = "3";
		}
		else if (num >= 20) {
			result = "2";
		}
		else {
			result = "1";
		}
		
		System.out.println("�����ϰ� �߻��� ���� " + num + " �� ���� �ڸ��� " + result + " �Դϴ�.");
	}

}
