package day16.win;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public  class MyChangeEvt implements ActionListener {
/*
 	�� Ŭ������ MyFrame ��ü�� change ��ư�� Ŭ���� �Ǿ����� �̺�Ʈ�� ó�����ֱ� ���� Ŭ����
 	���� �� Ŭ������ MyFrame ��ü�� ����ϰ� �־�� �۾��� ó���� �� ���̴�.
 	���� �� Ŭ������ MyFrame ��ü�� �ּҸ� ã�� ���� ��Ģ������ �Ұ����ϰ� 
 	������ �˷���� MyFrame�� ����� ������ �� �ְ� �ȴ�.
 	
 	���� �ٸ� Ŭ���������� MyFrame�� ��ü�� �ּҸ� �˾Ƴ��� ����� ���� ��ư� �׷��� �ڱ��ڽ��� 
 	�ڽ��� �ּҸ� �˷��� ���� ���� ���̴�.
 	���� �� Ŭ������ ��ü�� �Ǵ� ���� MyFrame�� ��ü�� �ּҸ� �޾Ƽ� ����ϰ� ������ �ȴ�.
 	
 	�׷��Ƿ� �� Ŭ������ ��ü�� �Ǵ� ���� ����Ǵ� �Լ� 
 	�����ڰ� ȣ��Ǵ� ���� MyFrame�� �ּҸ� ���޹޾Ƽ� ����Ű�� ��ü�� ����� �ָ� �ȴ�.
 	
 */
	MyFrame fr;
	public MyChangeEvt() {}
	public MyChangeEvt(MyFrame fr) {
		this.fr = fr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 	�� �Լ��� MyFrame�� change ��ư�� Ŭ���� �Ǵ� ���� �ڵ� ȣ��Ǵ� �Լ��̴�.
		 	���� �� �Լ����� MyFrame�� ������ �����Ű�� �۾��� �Ѵٸ� 
		 	��������� ��ư��Ŭ���� �ɶ� â�� ������ ������ �� ���̴�.
		 	�츮�� ��ư�� Ŭ���� �ɶ� â�� ������ �����ϰ� ��������ַ����Ѵ�.
		 	������ Color ��� Ŭ������ �ְ� �� Ŭ������ ��ü�� ���� ����ؾ� �Ѵ�.
		 	
		 */
		//	�� Į�� �ڵ� �����
		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		//	Į�� ��ü�� �����
		Color color = new Color(red, green, blue);
		
		//	������� Į�� MyFrame�� ��� �� pan�� �����Ų��.
		//	�츮�� MyFrame�� �ּҸ� fr ������ �����ѳ������Ƿ�
		//	������ �����ؼ� ó���ϸ� �ǰڴ�.
		fr.pan.setBackground(color);
		
		
	}
	
}
