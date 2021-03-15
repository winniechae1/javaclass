package day18;
/*
 	Scanner 를 이용해서 파일에 저장된 내용을 읽어서 출력해보자 .
 	day18.ex.Ex01.java
 */
import java.io.*;
import java.util.*;
public class Test03 {

	public Test03() {
		//	파일 객체 만들기 
		File f = new File("C:\\Users\\CHAEWON\\git\\javaclass\\jclass\\src\\day18\\ex\\Ex01.java");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(f);
			String str = sc.nextLine();
			System.out.println("Ex01 내용 : " + str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
