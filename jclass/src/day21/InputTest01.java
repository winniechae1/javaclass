package day21;

import java.io.*;
import java.util.*;
public class InputTest01 {

	public InputTest01() {
		/*
		 	 ����]	Ű���� ���� �ܺ���ġ�̴�. ���� ����ϴ� �ܺ���ġ�̱� ������ 
		 	 		�̹� ��Ʈ���� �غ��� ������ �����Ѵ�. �װ��� �ٷ� 
		 	 		System.in �̴�.
		 */
		int ch = 0;
		
		try {
/*			//	1. 
			System.out.print("�ѱ��� �Է� : ");
			ch = System.in.read();
			System.out.println("�Է��� ����1 : " + (char) ch);
			System.out.println("�Է��� ����2 : " + ch);
*/
/*
			// 	2.
			System.out.print("������ �Է�: ");
			//	���� ����� ����� ������ �غ��Ѵ�.
			byte[] buff = new byte[26];
			//	�̶� 256�̶�� �Է��� �κ��� ���ڿ� ���� �ѹ��� ���� �������� ���� �����ȴ�
			int len = System.in.read(buff);
			//	���
			System.out.println();
*/
			//	3. �ַ� ��Ʈ��ũ ó���� �� ���� ����ϴ� ��� 
			System.out.print("������ �Է� : ");
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte) 'A');
			int len = System.in.read(buff, 10, 100);
			/*
			 	�غ�� �迭 buff�� 10�� ����� ���� ������ ����ϼ���.
			 	�ִ� 100�������� ��������... (100�ڸ� �Է¹޴´�.)
			 */
			String str = new String(buff, 0, len + 10);
			System.out.println("�Է��� ���ڿ� : " + str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new InputTest01();
	}

}
