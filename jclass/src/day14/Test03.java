package day14;
/*
 	JFrame�� ��ӹ��� Ŭ������ ������.
 */
import javax.swing.*;
public class Test03 extends JFrame{
	
	public Test03() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// �ݱ��ư ��� ����
		setSize(450, 500);
		// JFrame �� ��ӹ޾ұ� ������
		// �ڵ������� JFrame�� ����� �� Ŭ������ ������ �ִ� ���°��ȴ�.
		// ���� ������� Ŭ������ ����� ��� ����� �� �ְ� �ƴ�.
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test03();
	}
}
