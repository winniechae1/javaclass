package day02;
/*
 	����6]
 		1���� 365.2426���̴�.
 		�̰��� ��ĥ ��ð�, �� ��, �������� ����ؼ� ����ϼ���.
 		
 		����]
 			1�� : 24�ð� 
 			1�ð� : 60��
 			1�� : 60�� 
 			
 			���� 0.5 ����  24 * 0.5 �ð��̹Ƿ�  12�ð��̴�. 
 			
 */
public class Ex06 {

	public static void main(String[] args) {
		
		double year = 365.2426;
		
		int day = 24; 
		int hour = 24 * day;
		int minute = 60 * hour;
		
		System.out.println("1���� " + year * day + "�ð��̰�" + year * hour +"��" + year*minute + "���̴�.");
		
		
		/*
		 	�ʿ��� ���� ����� 
		 	double tday = 365.2426;
		 	int day, hour, min, sec, tmp;
		 	
		 	�ϼ� ����Ѵ�.
		 	day = (int) tday;
		 	
		 	�ϼ��� �� ����� �� ������ ��ȯ�Ѵ�.(tmp) 
		 	tmp = (int)((tday - day) * 24 * 60 * 60);
		 	
		 	�ð� ����ϰ� 
		 	hour = tmp / 3600;
		 	tmp %= 3600;
		 	
		 	�� ����ϰ� 
		 	min = tmp / 60;
		 	
		 	��� ����Ѵ�. 
		 	System.out.println("�ϳ���" + tday + "�̰� �̰��� �� ������ ȯ���ϸ� " );
		 	System.out.println(day + "��" + hour + "�ð�" + min + "��" + sec + "�� �Դϴ�.");
		 */

	}

}
