package day20;

/*
 	���α׷��� ���õ� ������ �����غ���. 
 	
 */
import java.util.*;
public class Test12 {

	public Test12() {
		Properties prop = System.getProperties();
		/*
		 	System.getProperties()�� ���α׷��� ���õ� ������ Map���� ������ִ� �Լ��̴�. 
		 */
		Enumeration en = prop.keys();
		while(en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + " : " + value);
		}
		
	}

	public static void main(String[] args) {
		new Test12();
	}

}
