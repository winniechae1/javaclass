package day18;

import java.text.*;
import java.util.*;

public class Test09 {

	public Test09() {
		// TODO Auto-generated constructor stub
		Calendar cal = Calendar.getInstance();
		
		Date date = cal.getTime();	//	Date Ÿ������ ��ȯ 
		
		SimpleDateFormat form = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH:mm:ss");
		String sdate = form.format(date);
		System.out.println(sdate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test09();
	}

}
