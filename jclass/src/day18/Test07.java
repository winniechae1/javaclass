package day18;

import java.util.*;
public class Test07 {

	public Test07() {
		// Calendar cal = new Calenadar();	// ������ new ��ų�� ����.
		Calendar cal = Calendar.getInstance();
		
		//	�⵵
		int year = cal.get(Calendar.YEAR);
		//	��
		int month = cal.get(Calendar.MONTH) + 1;
		//	��
		int date = cal.get(Calendar.DATE);
		
		System.out.println(year + "�� " + month + "�� " + date + "��");
	}

	public static void main(String[] args) {
		new Test07();
	}

}
