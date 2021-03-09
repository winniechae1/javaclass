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
		System.out.println("------필터링 안한 리스트-----");
		
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
	 	day15 패키지의 파일 중 이름이 T로 시작하는 것만 출력하고자 한다.
	 */
	public boolean accept(File dir, String name) {
		if(name.startsWith("T")) {
			return true;
		}
		return false;
	}
}