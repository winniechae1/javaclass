package day08.ex;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		String[] f1 = {"ȫ�浿", "hong", "hong@increpas.com", "010-7777-7777", "M"};
		String[] f2 = {"��浿", "Gho", "gho@increpas.com", "010-8888-8888", "M"};
		String[] f3 = {"�Ѹ�", "dooly", "dooly@increpas.com", "010-2222-2222", "M"};
		String[] f4 = {"����", "dongee", "dongee@increpas.com", "010-1111-1111", "M"};
		String[] f5 = {"������", "mikol", "mikol@increpas.com", "010-3333-3333", "M"};
		
	
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
		
		String [][] frd = new String [5][5];
		
		System.arraycopy(f1, 0, frd[0], 0, f1.length);
		System.arraycopy(f2, 0, frd[1], 0, f2.length);
		System.arraycopy(f3, 0, frd[2], 0, f3.length);
		System.arraycopy(f4, 0, frd[3], 0, f4.length);
		System.arraycopy(f5, 0, frd[4], 0, f5.length);
		
		for(String[] f : frd) {
			System.out.println(Arrays.toString(f));
		}
		
		
		
	}
}
