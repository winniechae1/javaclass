package day03;

/*
 	1 ~ 10 ������ ���ڸ� �����ϰ� �߻����Ѽ� 
 	¦������ Ȧ������ �Ǻ��ؼ� ����ϴ� ���α׷��� �����ϼ���.
 */
public class Test10 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 10 + 1);
		
		String result = "Ȧ��";
		if (num % 2 == 0) {
			result = "¦��";
		}
		/*
		if (num % 2 != 0) {
			result = "Ȧ��";
		}
		*/
		System.out.println("�����ϰ� �߻��� ���� : " + num + " ��" + result + " �Դϴ�.");
	}
}
