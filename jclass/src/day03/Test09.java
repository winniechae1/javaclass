package day03;

/*
 	1 ~ 5 ������ ������ �����ϰ� �߻����Ѽ� 
 	1�� ��� "�ϳ�" 
 	2�� ��� "��"
 	...
 	5�� ��� "�ټ�"
 	���� ��µǰ� �ϼ���.
 */
public class Test09 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 5 + 1);
		
		String result = "";
		switch (num) {
		case 1:
			result = "�ϳ�";
			break;
		case 2:
			result = "��";
			break;
		case 3:
			result = "��";
			break;
		case 4:
			result = "��";
			break;
		case 5:
			result = "�ټ�";
			break;
		default:
				result = "�߸��� ����.";
		}
		System.out.println("�����ϰ� �߻��� ���� : " + num);
		System.out.println("�ѱ� ���� : " + result);
	}

}
