package day22;

/*
 	day22.data.desert.poem 을 읽어보자.
 	BufferedReader 스트림을 사용해서 읽어보자.
 */

import java.io.*;
public class BufferedReaderTest {

	public BufferedReaderTest() {
		//	스트림 준비
		//	타겟 스트림 준비
		FileReader fr = null;
		
		//	필터스트림 준비 
		BufferedReader br = null;
		
		try {
			fr = new FileReader("src/day22/data/desert.poem");
			//	타겟스트림에 연결하는 필터스트림을 만든다.
			br = new BufferedReader(fr);
			
			for(;;) {
				String line = br.readLine();	//	 readLine() - 한 행을 읽는 함수 , ("\r\n")을 만나면 그 이전까지만 읽어온다.
				if(line == null) {		//	읽어온 데이터가 없는 경우
					break;
				}
				System.out.println(line);	//	println() 출력 후 줄바꿈을 해주는 함수 
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new BufferedReaderTest();

	}

}
