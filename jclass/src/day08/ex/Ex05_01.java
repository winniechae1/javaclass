package day08.ex;
/*
f1 ~ f5 �����͸� �̿��ؼ�
friend �迭�� �����͸� ä�켼��.
				j=0
i=0				ģ��1		ģ��2		ģ��3		ģ��4		ģ��5
�̸�		:	f1[0]		f2[0]		f3[0]		f4[0]		f5[0]
���̵�		:	f1[1]		f2[1]		f3[1]
����		:
��ȭ��ȣ	:
����		:

*/
import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		String[] f1 = {"ȫ�浿", "hong", "hong@increpas.com", "010-7777-7777", "M"};
		String[] f2 = {"��浿", "Gho", "gho@increpas.com", "010-8888-8888", "M"};
		String[] f3 = {"�Ѹ�", "dooly", "dooly@increpas.com", "010-2222-2222", "M"};
		String[] f4 = {"����", "dongee", "dongee@increpas.com", "010-1111-1111", "M"};
		String[] f5 = {"������", "mikol", "mikol@increpas.com", "010-3333-3333", "M"};
		 
		
		
		String[][] friend = new String[5][5];
		 
		System.arraycopy(f1, 0, friend[0], 0, f1.length);
		System.arraycopy(f2, 0, friend[1], 0, f2.length); 
		System.arraycopy(f3, 0, friend[2], 0, f3.length); 
		System.arraycopy(f4, 0, friend[3], 0, f4.length); 
		System.arraycopy(f5, 0, friend[4], 0, f5.length); 
		
	
		for(int i = 0; i < friend.length; i++) {
			friend[i][0] = f1[i];
			friend[i][1] = f2[i];
			friend[i][2] = f3[i];
			friend[i][3] = f4[i];
			friend[i][4] = f5[i];
			
		}
		//���
		for(String[] s : friend) {
			System.out.println(Arrays.toString(s));
		}
		System.out.println();
		
		
	}
}

