package day20;

import java.io.*;
import java.util.*;
public class Test10 {
	Properties prop = new Properties();
	/*
	 	Properties �� Map�� �������� �ܺ���ġ�� �����͸� Map���� ������ �� �ִ�.
	 */
	public Test10() {
		/*
		 	�ܺ����ϰ� ������ �����̴�.
		 */
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day20/sample1.txt");
			/*
			 	���� ��θ� �̿��ؼ� C:\Users\CHAEWON\git\javaclass\jclass\src\day20\sample.txt
			 	�� ������� �о �ȴ�.
			 	��Ŭ���� �ȿ� �����͸� ����� �̰��� ��Ŭ���� �ڽ��� ��θ� ���Ӱ� ���ؼ� ó���ϹǷ� 
			 	��ó�� ����ص� �ȴ�.
			 */
			
			//	fin�� �ܺ���ġ�� �����Ͱ� ���޵� ����̰� ���� �츮�� prop�� ����� �ܺ���ġ�� �����͸� ����Ű�� �ȴ�.
			prop.load(fin);
			//	�� ����� ����Ǹ� ������ ������ �о Map���� ó���� ���Ҵ�.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//	�������ʹ� ��ġ HashMap�� �����Ͱ� ����� ��ó�� ����ϸ� �ȴ�.
		String name = (String) prop.get("name");
		String age = (String) prop.get("age");
		String tel = (String) prop.get("tel");
		String addr = (String) prop.get("addr");
		
		//	���
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("��ȭ : " + tel);
		System.out.println("�ּ� : " + addr);
	}

	public static void main(String[] args) {
		new Test10();
	}

}
