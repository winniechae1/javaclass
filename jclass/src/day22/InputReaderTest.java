package day22;

/*
 	FileInputStream(byte ����) ���Ͽ� �����ϰ� 
 	BufferedReader(char ����)�� �о��.
 */
import java.io.*;
public class InputReaderTest {
 
	public InputReaderTest() {
		// 	��Ʈ�� �غ�
		//	Ÿ�ٽ�Ʈ��
		FileInputStream fin = null;
		
		BufferedReader br = null;
		
		//	����� ���� ��Ʈ��
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
			System.out.println("�� �� �� ��");
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
