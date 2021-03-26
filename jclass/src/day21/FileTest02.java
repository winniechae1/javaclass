package day21;
/*
 	doc 폴더의 파일의 목록을 알아내자.
 	
 */
import java.io.*;
public class FileTest02 {

	public FileTest02() {
		File dir = new File("doc");
		
		/*
		//	목록 리스트 구현
		String[] flist = dir.list();
		for(int i = 0; i < flist.length; i++) {
			System.out.println(flist[i]);
		}
		*/
		
		/*
		//	정보 포함해서 리스트 구하기 
		File[] flist = dir.listFiles();
		for(int i = 0; i < flist.length; i++) {
			File fileInfo = flist[i];
			String fileName = fileInfo.getName();	// 파일이름 꺼내주는 함수 
			long len = fileInfo.length();
			
			System.out.println(fileName + " - " + len);
		}
		*/
		
		//	확장자가 .txt 인것만 골라서 출력해보자 
		String[] list = dir.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name)
			{
				if(name.endsWith("txt")) {
					return true;
				}
				return false;
				}
			});
		for(int i = 0; i < list.length; i++) {
			String fileName = list[i];
			System.out.println(fileName);
		}
		
	}

	public static void main(String[] args) {
		new FileTest02();
	}

}
