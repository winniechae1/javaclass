package day22;

/*
 	BufferedWriter ��Ʈ���� �̿��ؼ� desert.poem�� �����ؼ� desert.txt������ ������.
 */
import java.io.*;
public class BufferedWriterTest {

	public BufferedWriterTest() {
		// ���縦 �ؾ��ϹǷ� ����� ��Ʈ�� ��� �غ��Ѵ�
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//	��Ʈ�� ����� 
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
			System.out.println("���� ���� ����");
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
