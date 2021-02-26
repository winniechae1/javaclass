package jungsuk1;

/*
 	대문자를 소문자로 변경하는 코드인데 문자 ch에 저장된 문자가 대문자인 
 	경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다
 	
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
