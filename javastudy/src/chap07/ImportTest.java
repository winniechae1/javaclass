package chap07;
/*
 	import ���� �����Ϸ����� �ҽ����Ͽ� ���� Ŭ������ ��Ű���� ���� ������ �����ϴ� ���̴�.
 	��Ŭ������ 'ctrl + shift + o' �� ������ �ڵ����� import ���� �߰����ش�.
 	
 	[7-10]
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
	public static void main(String[] args) {
		
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("���� ��¥�� " + date.format(today));
		System.out.println("���� �ð��� " + time.format(today));
	}
}
