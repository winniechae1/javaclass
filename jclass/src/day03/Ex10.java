package day03;
/*
 	����10]
	1000 ~ 3000 �� �����ϰ� �߻����Ѽ� �ش� �⵵�� �������� ��������� �����ؼ� 
	������ִ� ���α׷��� �ۼ��ϼ���.
	
	����]
		������ 4�� ������ �������� �ش� ���� 100���� ������ �������� ���
		100���� �������� �� �� 400���� ���� �������� �ش� �����̶� �Ѵ�. 
	 
 
public class Ex10 {

	public static void main(String[] args) {
		
		int year = (int)(Math.random() * (3000 - 2000 + 1) + 1000);
		  
		int pyeong = year % 100;
		int yoon = pyeong % 4;
		String result = "";
		if ( pyeong == 0) {
			result = "���";
		}
		else if ( yoon == 0) {
			result = "����";
		}
		else 
			result = "��⵵ ���⵵ �ƴϴ�.";
		System.out.println("�ش�⵵�� " + year + "�� �ش�" + result);
	}

}
*/
import javax.swing.*;
public class Ex10 {

	public static void main(String[] args) {
		// 1. �Է¹޴´�.
			String sno = JOptionPane.showInputDialog("�ظ� �Է��ϼ���! ");
		// ������ ��ȯ�Ѵ�.	<< ���������� �ʿ��ϹǷ� ������ ��ȯ�Ѵ�. 
			int year = Integer.parseInt(sno);
		// ����� ���� ���� �غ��Ѵ�.
			String result = "";
		// 2. ����ó���Ѵ�.
			if(year % 400 == 0) {
				result = "����";
			} else if ( year % 100 == 0) {
				result = "���";
			} else if ( year % 4 == 0) {
				result = "����";
			} else {
				result = "���";
			}
		// 3. ��� ����Ѵ�.
			JOptionPane.showMessageDialog(null, "�Է��� �� [ " +
												sno + " ] �� [ " + 
												result + " ] �Դϴ�. "
				);
	}
}