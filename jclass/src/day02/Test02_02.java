package day02;
/*
  	ģ���� �̸��� �Է¹޾Ƽ� (showInputDialog())
  	 �޽��� â�� ����� ������ִ�(showMessageDialog) ���α׷��� �ۼ��ϼ���. 
 */
import javax.swing.*; // ����� Ŭ������ ��ġ�� �˷��ִ� ���
public class Test02_02 {

	public static void main(String[] args) {
		
		// �Է�â�� ����� �Էµ����͸� ������ ����Ų��. 
			String name = JOptionPane.showInputDialog("ģ���� �̸��� �Է��ϼ���!");
			
			System.out.println("�Է� ���� ģ���� �̸� : " + name);
		// ���â�� ����� �����͸� ����Ѵ�. 
			JOptionPane.showMessageDialog(null, "ģ���̸� : " + name);
	} 

}
