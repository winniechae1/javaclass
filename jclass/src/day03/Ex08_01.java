package day03;
/*
	����8]
		���ĺ� ���� �ϳ��� �Է��� �� �� ���ڰ� �빮���̸� �ҹ��ڷ� 
		�ҹ����̸� �빮�ڷ� ��ȯ���Ѽ� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	���ڸ� �Է¹޴� ���]
		1. ���ڿ��� �Է¹ް� 
			sc.nextLine(), sc.next()
		2. ���ڿ��� ù��° ��ġ�� ���ڸ� �̾Ƴ���.
			���ڿ�������.charAt(0);
		
			����]
				charAt(index)
				>> ���ڿ��� Ư����ġ�� ���ڸ� ��ȯ���ִ� �Լ� 
				
				��]
					String str = "abcd";
					
					����° ��ġ�� ����
					char ch = str.charAt(2);
					
					������ ���̽������� ��ġ���� 1���� �����̾����� �ٸ� ��� ������ 
					��ġ���� ������ 0���� �����Ѵ�.
*/
import java.util.*;
public class Ex08_01 {
	public static void main(String[] args) {
		/*
//		char ch = (char)(Math.random() * 256);
		// �Էµ��� �غ�
		Scanner sc = new Scanner(System.in);
		// �Է¹ް�
		System.out.print("���ڸ� �Է��ϼ��� : ");
		String str = sc.nextLine();
		// ���ڷ� ��ȯ�ϰ� 
		char ch = str.charAt(0);
		char ch1 = 0;
		// ���ϰ�
		if (ch <= 'Z') {
			// �빮���� ���
			// �� ���� �ҹ��ڷ� ��ȯ���Ѿ� �ϰ� ��ȯ��Ű�� ����� (char)(���� + ('a' - 'A'))
			ch1 = (char)(ch + ('a'-'A'));
		}
		else {
			// �ҹ����ΰ��
			ch1 = (char)(ch - ('a'-'A'));
		}
		*/
		/*
		 	3�� �����ڷ� �ذ��ϴ� ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		char ch1 = 0;
		ch1 = (ch <= 'Z') ? (char)(ch + ('a' - 'A' )) : (char)(ch - ('a' - 'A'));
		System.out.println("�Է��� ���� : " + ch);
		System.out.println("��ȯ�� ���� : " + ch1);
	}
		
}
