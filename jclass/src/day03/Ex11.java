package day03;
/*
 	����11]
	3�ڸ� ���ڸ� �Է¹޾Ƽ� �� ���ڿ��� ���� ����� 100�� ����� ����� ���ؼ��� 
	�󸶰� �ʿ������� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���. 

	��]
		241    - 200 �� �����Ƿ� 41�� �����Ѵ�.
 */
import java.util.*;
public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3�ڸ� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sul = num % 100;
		String result = ((sul < 50) ? ( (num-sul)  + "�� �����Ƿ�" + sul + " �� �����Ѵ�.")  
								: ((num-sul+100) + "�� �����Ƿ� " + (100-sul) + " �� ���ؾ��Ѵ�.") );
		 
		System.out.println("�Է��� ���� " + num + "�� " + result );

	}

}
