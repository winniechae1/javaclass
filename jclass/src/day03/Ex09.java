package day03;

/*
 	����9]
	�Խù��� �Խ��ǿ� ����ϴµ� �ϳ��� �Խ��� ���������� �Խù��� 15���� ����� �� �ִ�.
	�Խù��� ������ �����ϰ� �߻���Ų �� ��� �������� �ʿ����� ����ؼ� ������ִ� 
	���α׷��� �ۼ��ϼ���.
 */
public class Ex09 {
 
	public static void main(String[] args) {
		int count = (int)(Math.random() * (100 - 0 + 1) + 0 );
		int page;
		
		int result = count / 15; 
		 
		if (result == 0) {
			page = 1;
		}
		else if ((result % 15) != 0){ 
			page = result + 1;
		}
		else {
			page = result;
		}
		System.out.println("�Խù� ���� : " + count);
		System.out.println("������ �� : " + page); 
	}

}
