package jungsuk1;

/*
 	�빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��ε� ���� ch�� ����� ���ڰ� �빮���� 
 	��쿡�� �ҹ��ڷ� �����Ѵ�. �����ڵ�� �ҹ��ڰ� �빮�ں��� 32��ŭ �� ũ��
 	
 */
public class E3_10 {

	public static void main(String[] args) {
		char ch = 'A';
		
//		char lowerCase = (int)(ch + 32) > ch ? (char)(ch + 32) : (char)ch;
		
		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32) : ch;
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}

}
