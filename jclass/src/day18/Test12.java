package day18;

import java.text.*;
public class Test12 {

	public Test12() {
		/*
		 	���� ���ڿ� 
		 		"Name : ȫ�浿, Tel : 010-1111-1111, Age : 18";
		 		"Name : ��浿, Tel : 010-2222-2222, Age : 35";
		 		
		 */
		MessageFormat form = new MessageFormat("Name : {0}, Tel : {1}, Age : {2}");
		/*
		 	������ ������ �״�� ���� 
		 	����Ǵ� �κ��� {0}, {1}, {2} �� ����Ѵ�.
		 	��ȣ�� �ԷµǴ� �������� ������ �ǹ��Ѵ�.
		 */
		//	�ѻ���� �����͸� �迭�� �غ��Ѵ�.
		Object[] obj = {"ȫ�浿", "010-1111-1111", 18};
		
		String str = form.format(obj);
		System.out.println(str);
		obj = new Object[] {"��浿", "010-2222-2222", 35};
		str = form.format(obj);
		System.out.println(str);
	}

	public static void main(String[] args) {
		new Test12();
	}

}
