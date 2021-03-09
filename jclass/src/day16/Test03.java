package day16;

import java.io.File;
import java.io.FilenameFilter;

public class Test03 {

	public Test03() {
		
		File file = new File("C:\\Users\\CHAEWON\\git\\javaclass\\jclass\\src\\day15");
		
		String[] list = file.list(new MyFilter());
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("-----------------------------");
		System.out.println("------���͸� ���� ����Ʈ-----");
		
		String[] list1 = file.list();
		
		for(String s : list1) {
	         System.out.println(s);
	      }

	}

	public static void main(String[] args) {
		new Test03();
	}

}
class MyFilter implements FilenameFilter {
	/*
	 	day15 ��Ű���� ���� �� �̸��� T�� �����ϴ� �͸� ����ϰ��� �Ѵ�.
	 */
	public boolean accept(File dir, String name) {
		if(name.startsWith("T")) {
			return true;
		}
		return false;
	}
}