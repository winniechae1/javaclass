package day16;

import java.util.*;
public class Test05 {

	public Test05() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String str = sc.nextLine();
		
		int no = 0;
//		no = Integer.parseInt(str);
		
		try { 
			no = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			//	���� ���� ��� ���
			//	1. ���� ��� ���
//			System.out.println(e);	//	���� ������ ���
			
			//	2. ���� ������ ��ġ���� ����ϴ� ���
			e.printStackTrace();
			no = -999;
		}
		
		System.out.println("no : " + no);
		}

	public static void main(String[] args) {
		new Test05();

	}

}
