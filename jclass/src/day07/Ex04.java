package day07;

import java.util.Arrays;

/*
 	�����ϰ� �ҹ��ڸ� 6���� �߻����Ѽ� �迭�� ��� 
 	�迭�� ��� ������ �������� 
 */
public class Ex04 {

	public static void main(String[] args) {

		char[] ch = new char[6];
		char[] ch1 = new char[6];
		
		// ������ ���� ������ ä��� 
		for(int i = 0; i < 6; i++) {
			char c = (char)(Math.random() * ('z'-'a'+1)+'a');
			ch[i] = c;
			
		}
		System.out.println(Arrays.toString(ch));
		for(int i = 0; i < 6; i++) {
			ch1[i] =ch[ch.length-1-i];
		}
		for(char c : ch1) {
			System.out.print(c + " ");
		}
		
		/*
		 	0	5	-0
		 	1	4	-1
		 	2	3	-2
		 	3	2	-3
		 	4	1	-4
		 	5	0	-5
		 */
	}

}
