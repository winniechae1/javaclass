package day04.ex;
/*
 	0 ~ 25 ������ ���� �����ϰ� �ϳ��� �߻����Ѽ� 
 		
 	 0 - 0�Դϴ�.
 	 2�ǹ�� - 2�� ����̴�.
 	 3�ǹ�� - 3�� ����Դϴ�.
 	 2�� 3�� ����� ��� - 2�� 3�� ����Դϴ�. 
 	 �� �̿��� ��� - ������ ���Դϴ�.
 	 �� ������ִ� ���α׷��� �ۼ��ϼ���. 
 */
public class Ex02 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * ( 25 - 0 + 1) + 0);
		String result = "";
			if(num != 0) {
			switch (num % 6) {
			case 0:
				result = "2�� 3�� ����Դϴ�.";
				break;
			case 2:
				result = "2�� ����Դϴ�.";
				break;	
			case 3:
				result = "3�� ����Դϴ�.";
				break;
			case 4:
				result = "2�� ����Դϴ�.";
				break;
			default:
				result = " ������ ���Դϴ�.";
			}
		}
			else 
				result = "0 �Դϴ�.";
			
	
		System.out.println("�Է� ���� " + num + " �̰�"+ result);
	}
}

/*
int num2 = num % 2;
int num3 = num % 3;
int num6 = num % 6;
String result = "";

if (num == 0) {
	result = "0 �Դϴ�.";
}
else if (num6 == 0) {
	result = "2�� 3�� ����Դϴ�.";
}
else if (num3 == 0) {
	result = "3�� ����Դϴ�.";
}
else if (num2 == 0 ) {
	result = "2�� ����Դϴ�.";
}
else {
	result = "������ ���Դϴ�.";
}
System.out.println("�Է��� �� " + num + " �� " + result);
*/


