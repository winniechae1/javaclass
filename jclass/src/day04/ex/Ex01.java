package day04.ex;

/*
 	String Ŭ������ equals() �Լ��� ����ؼ� ó���ϼ���.
 	
 	���ڿ��� �Է¹޾Ƽ� 
 		"M" - �����Դϴ�.
 		"��" - �����Դϴ�.
 		"����" - �����Դϴ�.
 		"����" - �����Դϴ�.
 		"F" - �����Դϴ�.
 		"��" - �����Դϴ�.
 		"����" - �����Դϴ�.
 		"����" - �����Դϴ�.
 		�̿��� ���� - �߸��Է��߽��ϴ�.
 		�� ��µǴ� ���α׷��� �ۼ��ϼ���.
 */
import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		String result = "";
		switch (str) {
		case "M" :
			result = "�����Դϴ�.";
		break;
		case "��" :
			result = "�����Դϴ�.";
		break;
		case "����" :
			result = "�����Դϴ�.";
		break;
		case "����" :
			result = "�����Դϴ�.";
		break;
		case "F" :
			result = "�����Դϴ�.";
		break;
		case "��" :
			result = "�����Դϴ�.";
		break;
		case "����" :
			result = "�����Դϴ�.";
		break;
		case "����" :
			result = "�����Դϴ�.";
		break;
		default : 
			result = "�߸� �Է��߽��ϴ�.";
		}
		System.out.println("�Է��� ���ڿ� " + str + " �� " + result );
	}
}
