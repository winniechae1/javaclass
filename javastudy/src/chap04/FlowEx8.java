package chap04;

import java.util.Scanner;

public class FlowEx8 {

	public static void main(String[] args) {
		char gender;
		String regNo = "";
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���.(011231-1111222)>");
		
		Scanner sc = new Scanner(System.in);
		regNo = sc.nextLine();
		gender = regNo.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("����� �����Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("����� �����Դϴ�.");
			break;
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
	}

}
