package day21;
/*
 	1. 
 */
import java.io.*;
public class FileTest01 {

	public FileTest01() {
		// 만들고 싶은 폴더 파일로 만들자 (폴더 없어도 상관없음)
		/*
		File file = new File("C:\\example");
		file.mkdir();
		*/
		/*
		// 2.
		File file = new File("C:\\class\\java\\example\\day20");
		file.mkdirs();
		*/
		/* 
		// 3.
		File file = new File("C:\\example");
		file.delete();
		*/
		
		// 특정 파일의 이름을 다른이름으로 변경하자.
		File oldFile = new File("C:\\\\class\\\\java\\\\example\\\\day20");
		File newFile = new File("C:\\\\class\\\\java\\\\example\\\\day21");
		oldFile.renameTo(newFile);
	}

	public static void main(String[] args) {
		new FileTest01();
	}

}
