package day02;

/*
 	�������� �Է¹޾Ƽ� ���� ���̸� ������ִ� ���α׷��� �ۼ��ϼ���.
 */

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ��� : ");
		
		int rad = sc.nextInt();
		// �� ��쵵 ���ڰ� �ƴ� �ٸ� ���� �Ǵ� �Ǽ� ���¸� �Է��ϸ�  ������ ����.
		Double area = rad * rad * 3.14;
		
		System.out.println("�������� " + rad + " �� ���� ���̴� : " + area + "�Դϴ�.");
		
	}
}
