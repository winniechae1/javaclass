package chapter4;
/*
 	���ڷ� �̷���� ���ڿ� str�� ������ �� �ڸ��� ���� ���� ����� ����ϼ���.
 	"12345" ��� '1+2+3+4+5' �� ����� 15�� ����ϼ���.
 */
public class E4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0'; // ���� '0' �� ���� 0 ���� ��ȯ�ϴ� ���
		}
		System.out.println("sum = " + sum);

	}

}
