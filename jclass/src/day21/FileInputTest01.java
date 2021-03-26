package day21;

import java.io.*;
public class FileInputTest01 {

	public FileInputTest01() {
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day21/InputTest01.java");
			
			/*
			//	1. 한글자만 
			int ch = fin.read();
			System.out.println((char) ch);
			*/
			
			/*
			// 	2. 여러글자만
			byte[] buff = new byte[1024];
			int len = fin.read(buff);
			String str = new String(buff,0,len);
			System.out.println(str);
			*/
			
			//	3. 파일 전체 내용을 읽어보자 
			while(true) {
				//	일단 한번 적당량을 읽어보자 .
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				
				if(len == -1) {
					break;
				}
				String str = new String(buff, 0, len);
				System.out.println(str);
			}
		} catch(Exception e) {
			
		} finally {
			try {
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileInputTest01();
	}

}
