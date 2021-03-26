package day22;

/*
 	FileInputStream(byte 단위) 파일에 연결하고 
 	BufferedReader(char 단위)로 읽어보자.
 */
import java.io.*;
public class InputReaderTest {
 
	public InputReaderTest() {
		// 	스트림 준비
		//	타겟스트림
		FileInputStream fin = null;
		
		BufferedReader br = null;
		
		//	연결용 필터 스트림
		InputStreamReader ir = null;
		
		try {
			fin = new FileInputStream("src/day22/data/desert.poem");
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			System.out.println();
			System.out.println("작 업 종 료");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new InputReaderTest();

	}

}
