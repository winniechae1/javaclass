package chap04;

import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		int month = 0;
		System.out.print("���� ���� �Է��ϼ���>");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		month = Integer.parseInt(tmp);
	
	switch(month) {
	case 3:
	case 4:
	case 5:
		System.out.println("������ ������ ���Դϴ�.");
		break;
	case 6:
		System.out.println("������ ������ �����Դϴ�.");
		break;
	case 9: case 10: case 11:
		System.out.println("������ ������ �����Դϴ�.");
		break;
	case 12: case 1: case 2:
		System.out.println("������ ������ �ܿ��Դϴ�.");
		break;
	}

	}
}