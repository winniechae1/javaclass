package day06;
/*
	10���� ���ڸ� ����� �޸𸮸� ����� 
	�޸𸮿� 'A' ~ 'J' ���� ���ʷ� ����� �� ����ϼ���.
*/

public class Test05_01 {
	public static void main(String[] args) {
		
		char[] ch;
		
		ch = new char[10];
		
		for(int i = 0; i < 10; i++) {
			ch[i] = (char)('A'+ i);
			
		}
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " , ");
		}
		System.out.println();
	}
}
