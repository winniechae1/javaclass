package day08.ex;

public class Ex05 {

	public static void main(String[] args) {
		String[] f1 = {"ȫ�浿", "hong", "hong@increpas.com", "010-7777-7777", "M"};
		String[] f2 = {"��浿", "Gho", "gho@increpas.com", "010-8888-8888", "M"};
		String[] f3 = {"�Ѹ�", "dooly", "dooly@increpas.com", "010-2222-2222", "M"};
		String[] f4 = {"����", "dongee", "dongee@increpas.com", "010-1111-1111", "M"};
		String[] f5 = {"������", "mikol", "mikol@increpas.com", "010-3333-3333", "M"};
		
		String[][] friend = new String[5][5];
		/*
			f1 ~ f5 �����͸� �̿��ؼ�
			friend �迭�� �����͸� ä�켼��.
			
						�̸�	���̵�	����	��ȭ��ȣ 	����
			ģ��1	: 
			ģ��2   :
			ģ��3	:
			ģ��4	:
			ģ��5	:
			
		 */
		
		friend[0] = f1;
		friend[1] = f2;
		friend[2] = f3;
		friend[3] = f4;
		friend[4] = f5;
		System.out.print("�̸�    " + "���̵�   " + "����         " + "��ȭ��ȣ           " + "���� ");
		System.out.println();
		for(int i = 0; i < friend.length; i++) {
			for(int j = 0; j < friend[i].length; j++) {
				System.out.print( friend[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
}
