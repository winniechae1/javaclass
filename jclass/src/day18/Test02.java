package day18;
/*
 	 Ư�� ���ڿ��� �Է��� �� �� ���ڿ� �� ��Ģ�� �´� �κи� ��� ����غ���.
 	
 */
import java.util.regex.*;
public class Test02 {

	public Test02() {
		String tell = "��ä�� : 010-2402-4746";
		//	�� ���ڿ� �߿��� ��ȭ��ȣ�� ��������.
		String pattern = "01[0-9]-[0-9]{4}-[0-9]{4}";
		//	1. ���Խ� �˻� 
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(tell);
		
		if(m.find()) {
			String group = m.group();
			System.out.println("�� ��ȭ��ȣ : " + group);
		}
	
	}

	public static void main(String[] args) {
		new Test02();
	}

}
