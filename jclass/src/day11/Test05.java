package day11;
import java.awt.*;
import javax.swing.*;
public class Test05 {
	public Test05() {
		/*
		 	��ȭ���� �ϳ��� ����� �ʹ�.
		 	��ü���� ���� ��ȭ���ڸ� ������ִ� ��ǰ(Ŭ����)�� �̹� ������� �ְ� 
		 	�츮�� �̰��� ��븸 �ϸ� �ȴ�. 
		 	�ٽø��ؼ� ���� ������ ���·� ������ָ� �ȴ�. 
		 */
		
		//	�������� �ϳ� ����� 
		JFrame f = new JFrame();
		//	���̾ƿ� ��å �����ϰ� 
		f.setLayout(new FlowLayout());
		
		//	â���� ��ư�� �߰��غ���.
		//	���� ��ư�� �����. �̰� ���� �ڹٿ��� �̹� Ŭ������ ����� ���Ҵ�.
		JButton btn1 = new JButton("�¿�");
		JButton btn2 = new JButton("���");
		JButton btn3 = new JButton("����");
		JButton btn4 = new JButton("Ƽ�Ĵ�");
		JButton btn5 = new JButton("����");
		
		//	���డ���� ���� ��ư�� â���� �߰��Ѵ�. 
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		
		//	�� â�� ����� 400 x 400 ���� �����ϰ� 
		f.setSize(400, 400);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Test05();

	}

}
