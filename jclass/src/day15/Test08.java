package day15;

import java.sql.Date;
import java.util.Calendar;

public class Test08 {

	public Test08() {
		/*
		 ���� �ð��� ����غ���.
		 �ڹٿ��� ��¥�� �����ϴ� Ŭ������ 
		 	Date ��� Ŭ������ ������ 
		 ����� Calendar ���� �� Ŭ������ ��������� �� Ŭ������ ����ϱ⸦ �����ϰ� �ִ�.
		*/
		/*
		Date date = new Date();
		
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		*/
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
	}

	public static void main(String[] args) {
		new Test08();
	}

}
