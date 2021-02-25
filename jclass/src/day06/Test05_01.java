package day06;
/*
	10개의 문자를 기억할 메모리를 만들고 
	메모리에 'A' ~ 'J' 까지 차례로 기억한 후 출력하세요.
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
