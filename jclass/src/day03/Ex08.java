package day03;

/*
 	����8]
	���ĺ� ���� �ϳ��� �Է��� �� �� ���ڰ� �빮���̸� �ҹ��ڷ� 
	�ҹ����̸� �빮�ڷ� ��ȯ���Ѽ� ������ִ� ���α׷��� �ۼ��ϼ���.
	
 */
import java.util.*;
public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ĺ� ���ڸ� �Է��ϼ��� : ");
		char alpha = sc.next().charAt(0);
		
		
		
		char sm = (char)(alpha + ('a' - 'A'));
		char bi = (char)(alpha - ('a' - 'A'));
		char result = ((alpha >= 'A' && alpha <= 'Z') ? 
							sm : ((alpha >= 'a' && alpha <= 'z') ? bi : sm));
		
		System.out.println("�Է��� ���ڴ� " + alpha + "��ȯ ��Ų ���ڴ� " + result);
		
		
	}

}
