package day18.ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
 	����1]	
 		���̵� ���Խ� �˻縦 �ϴ� ���α׷��� �ۼ��ؼ� �����ϼ���.
 		
 		���̵� ������ 
 			ù���ڴ� �ҹ��ڷ� �����ϰ� ������ ���ڴ� ���ڷ� ������.
 			8���ڷ� ������ ���̵� ����ؾ� �Ѵ�.
 			�����ڿ� ���ڸ� ����ϴ� ������ �Ѵ�.
 */
public class Ex01 {

	public Ex01() {

		String id = "winchan1";
		
//		String source =	"[a-z][a-zA-Z0-9]{6}[0-9]";
		String source =	"[a-z].*[0-9]";
		
		Pattern p = Pattern.compile(source);

		Matcher m = p.matcher(id);

		if(m.matches()) {
			System.out.println("�ùٸ� id�Դϴ�.");
		} else {
			System.out.println("�ùٸ� id�� �ƴմϴ�.");
		}

	}
	public static void main(String[] args) {
		new Ex01();
	}

}
