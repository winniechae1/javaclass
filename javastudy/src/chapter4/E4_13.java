package chapter4;
/*
 	�־��� ���ڿ��� ���������� �Ǻ��ϴ� ���α׷�
 */
public class E4_13 {

	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i = 0; i < value.length(); i++) {
			if(!(value.charAt(i) >= '0' && value.charAt(i) <= '9')) {
				isNumber = false;
				break;
			}
		}
		if(isNumber) {
			System.out.println(value + "�� �����Դϴ�.");
		}else {
			System.out.println(value + "�� ���ڰ� �ƴմϴ�.");
		}
	}
}
