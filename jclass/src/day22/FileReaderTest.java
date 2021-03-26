package day22;
/*
 	FileWriterTest01 에서 저장한 파일을 읽어오자.
 */
import java.io.*;
public class FileReaderTest {

	public FileReaderTest() {
		FileReader fr = null;
		try {
			//	타겟 스트림 만들고 
			fr = new FileReader("src/day22/data/fwTest.txt");
			/*
			//	1. 한글자 읽기
			int ch = fr.read();
			System.out.println((char) ch);
			*/
			
			//	2. 여러글자 읽기
			while(true) {
				char[] buff = new char[1024];
				int len = fr.read(buff);	//	입력된 문자배열에 읽은 문자를 채워주고 읽은 문자의 개수를 반환해준다. 
				//	읽은 문자가 없는 경우는 len에 -1이 기억된다.
				if(len == -1) {
					//	이 경우 반복문을 종료한다.
					break;
				}
				 
				String str = new String(buff,0, len);
				
				System.out.print(str);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileReaderTest();
	}

}
