package day21;
/*
 	1. 
 */
import java.io.*;
public class FileTest01 {

	public FileTest01() {
		// ����� ���� ���� ���Ϸ� ������ (���� ��� �������)
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
		
		// Ư�� ������ �̸��� �ٸ��̸����� ��������.
		File oldFile = new File("C:\\\\class\\\\java\\\\example\\\\day20");
		File newFile = new File("C:\\\\class\\\\java\\\\example\\\\day21");
		oldFile.renameTo(newFile);
	}

	public static void main(String[] args) {
		new FileTest01();
	}

}
