package day03;

/*
	1 ~ 10 ������ ���ڸ� �����ϰ� �߻����Ѽ� 
	¦������ Ȧ������ �Ǻ��ؼ� ����ϴ� ���α׷��� �����ϼ���.
	if else ������� ó���ϼ���.
*/
public class Test11 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 10 + 1);
		
		String result = " ";
		if (num % 2 == 0) {
			result = "¦��";
		}
		else {
			result = "Ȧ��";
		}

		System.out.println("�����ϰ� �߻��� ���� " + num + " ��" + result + " �Դϴ�.");
	}
	
}
