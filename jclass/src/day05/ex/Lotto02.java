package day05.ex;
/*
 	�ζ� 1������ ���� ����ϼ���.
 */
public class Lotto02 {

	public static void main(String[] args) {
		
		String lotto = "";
		int i = 0;
		
		while (i < 6) {
			int num = (int)(Math.random() * 45 + 1);
			
			lotto += " " + num;
			
			i++;
		}
		System.out.println("�ζ�1���� : " + lotto);

	}

}
