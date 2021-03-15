package day18;
/*
 	���� ��ǻ���� ��¥�� �ð��� ����غ���
 */
import java.util.*;

public class Test06 {

	public Test06() {
		Date date = new Date();
		toPrint(date);
		try {
			Thread.sleep(3000);	// 3�ʵ��� ����..
		} catch (Exception e) {
			
		}
		System.out.println();
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);	// 3�ʵ��� ����..
			} catch (Exception e) {
				
			}
			date = new Date();
			toPrint(date);
			System.out.println();
		}
	}
	public void toPrint(Date date) {
		int year = date.getYear() + 1900;
		System.out.print(year + " ��, ");
		//	�⵵�� ������ 1900���� �������� �ϱ� ������ ������ �������� 1900�� ������� ��Ȯ�� �⵵�� ���´�.
		int month = date.getMonth()+1;
		System.out.print(month+ " ��, ");
		//	���� ������ 0���� ����� �ϱ� ������ ��Ȯ�� ���� +1�� ����� �Ѵ�.
		int day = date.getDate();
		System.out.print(day+ " ��, ");
		int week = date.getDay();
		String sweek = getSweek(week);
		
		System.out.print(sweek + ", ");
		
		int hour = date.getHours();
		System.out.print(hour+ " ��, ");
		
		int min = date.getMinutes();
		System.out.print(min +" ��, ");
		
		int sec = date.getSeconds();
		System.out.print(sec + " �� ");
		
	}
	public String getSweek(int week) {
		String sweek = "";
		switch(week) {
		case 0:
			sweek = "�Ͽ���";
			break;
		case 1:
			sweek = "������";
			break;
		case 2:
			sweek = "ȭ����";
			break;
		case 3:
			sweek = "������";
			break;
		case 4:
			sweek = "�����";
			break;
		case 5:
			sweek = "�ݿ���";
			break;
		case 6:
			sweek = "�����";
			break;	
		}
		return sweek;
	}
	public static void main(String[] args) {
		new Test06();
	}

}
