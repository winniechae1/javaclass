package day08;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		// String �迭 �ʱ�ȭ
		String[] str1 = {"ȫ�浿" , "��浿", "�Ѹ�"};
		
		String[] str2 = new String[] {"ȫ�浿" , "��浿", "�Ѹ�"};
		
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));
		
		String[] str3 = new String[3];
		
		System.out.println(Arrays.toString(str3));
	} 

}
