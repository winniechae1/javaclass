package chap07;
/*
 	import 문은 컴파일러에게 소스파일에 사용된 클래스의 패키지에 대한 정보를 제공하는 것이다.
 	이클립스는 'ctrl + shift + o' 를 누르면 자동으로 import 문을 추가해준다.
 	
 	[7-10]
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
	public static void main(String[] args) {
		
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘 날짜는 " + date.format(today));
		System.out.println("현재 시간은 " + time.format(today));
	}
}
