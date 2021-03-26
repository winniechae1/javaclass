package day22;

/*
 	BufferedWriter 스트림을 이용해서 desert.poem을 복사해서 desert.txt파일을 만들어보자.
 */
import java.io.*;
public class BufferedWriterTest {

	public BufferedWriterTest() {
		// 복사를 해야하므로 입출력 스트림 모두 준비한다
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//	스트림 만들고 
			fr = new FileReader("src/day22/data/desert.poem");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("src/day22/data/desert.txt");
			bw = new BufferedWriter(fw);
			
			for (;;) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				bw.write(line + "\r\n");
			}
			System.out.println("파일 저장 성공");
		} catch(Exception e) {
			
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new BufferedWriterTest();
	}

}
