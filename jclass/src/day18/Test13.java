
package day18;

import java.text.*;
public class Test13 {

	public Test13() {
		String sql = "INSERT INTO emp VALUES(1234, 'ȫ�浿', '�ѹ���', 2000)";
		/*
		 	�� �߿��� �����͸� ���� ������ ���� ���?
		 	����]
		 		MessageFormat ���� �����Ͱ� �� �κ��� ����� ������ �����.
		 		
		 		parse() �� �̿��ؼ� ������ �κ��� �����س��� �ȴ�.
		 		
		 */
		MessageFormat form = new MessageFormat("INSERT INTO emp VALUES({0}, {1}, {2}, {3})");
		Object[] obj = null;
		try {
			obj = form.parse(sql);
			for(Object o : obj) {
				System.out.print(o + " , ");
			}
		}	catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test13();
	}

}
