package day03;

/*
 	���� 6]
 		�ҹ��ڸ� �����ϰ� �߻����Ѽ� 
 		�� ���ڸ� �빮�ڷ� ��ȯ���Ѽ� ����ϼ���.
 		
 		'a' - 'A' = 32
 		'z' --> 'Z' : 'z' - 32
 		
 		'z' - ('a' - 'A') = 'Z'
 */
public class Ex06 {

	public static void main(String[] args) {
		
		char ch = (char)(Math.random() * ('z' - 'a' + 1) + 'a');
		
		char ch1 = (char)(ch - ('a' - 'A'));
		System.out.println("���� �ҹ��� : " + ch);
		System.out.println("�빮�� : " + ch1);
	}

}
