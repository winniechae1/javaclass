package day18;

import java.text.*;
public class Test08 {

	public Test08() {
		float no = 32456.45678f;
		/*
		 	�� ���ڸ� 3�ڸ����� , �� ���̰� �Ҽ��� ���ϴ� 3 �ڸ������� ����ϵ��� �ϰ� �ʹ�.
		 */
		//	���� ������ ���ϰ�
		DecimalFormat form = new DecimalFormat("00,000,000.000");
		//	���Ŀ� �´� ���ڿ��� ����� �ش�.
		String str = form.format(no);
		//	format(double number) ==> ���ڸ� ������ �ִ� ���ڿ��� ��ȯ�����ִ� �Լ�
		System.out.println(str);
		// ���� ������ ���ϰ� 
		DecimalFormat form1 = new DecimalFormat("##,###,###.###");
		//	���Ŀ� ���� 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test08();
	}

}
