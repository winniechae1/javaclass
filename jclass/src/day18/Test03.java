package day18;
/*
 	Scanner �� �̿��ؼ� ���Ͽ� ����� ������ �о ����غ��� .
 	day18.ex.Ex01.java
 */
import java.io.*;
import java.util.*;
public class Test03 {

	public Test03() {
		//	���� ��ü ����� 
		File f = new File("C:\\Users\\CHAEWON\\git\\javaclass\\jclass\\src\\day18\\ex\\Ex01.java");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(f);
			String str = sc.nextLine();
			System.out.println("Ex01 ���� : " + str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
