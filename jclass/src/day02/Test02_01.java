package day02;

import javax.swing.*;
public class Test02_01 {
	public static void main(String[] args) {
		
		// 1. �Էµ��� �غ��ϰ� 
			/*
			���⼭�� javax.swing ������ �̹� �ڵ��Ǿ��ִ� JOptionPane �̶�� Ŭ������ 
			���ڿ��� �޽����� �Է¹޴� ����� �Լ� showInputDialog()�� ����ؼ� ���ڿ��� �Է¹޵��� �Ѵ�.
			
			�� �Լ��� GUI â�� ������� �Է¹޴´�.
			(�Է¸޽��� â�� ���� �Է¹޴� �Լ��̴�.)
			
			�̶� �Էµ����ʹ� ���ڿ��� �Է¹ް� �ȴ�.
			���� ������ ������ ���� 
			���� ����� Ÿ������ ��ȯ��������Ѵ�. 
			*/
		// 2.  �Է¸޽��� ����ϰ� 
		// showInputDialog() �Լ��� �Ű������� �ԷµǴ� ���ڿ��� 
		// �Է¸޼����� ����� �Ǳ� ������ ���⼭�� �ʿ����. 
		// 3. �Է¹޾� ������ ����ϰ� 
			String garo = JOptionPane.showInputDialog("���θ� �Է��ϼ���!");
			String sero = JOptionPane.showInputDialog("���θ� �Է��ϼ���!");
		// 4. ������ ��ȯ�ϰ�  
			int width = Integer.parseInt(garo);
			int height = Integer.parseInt(sero);
		// 5. ���� ����ϰ� 
			int result = width * height;
		// 6. ����ϰ�
			System.out.printf("%3s : %5d\n%3s : %5d\n%3s : %5d","����",width,
								"����",height ,"����",result );
			
		// ��¿� ���ڿ� ���� ������ ����ϰ� 
			String msg = "����  : " + width + "\n���� : " + height + "\n���� :" + result;
		// ����ϰ�
			JOptionPane.showMessageDialog(null, msg);
			
	}
}



