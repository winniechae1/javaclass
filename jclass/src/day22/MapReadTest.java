package day22;

/*
 	ObjectTest02 에서 저장한 map.txt 파일을 읽어서 출력해보자
 */

import java.io.*;
import java.util.*; 

public class MapReadTest {
	
	public MapReadTest() {
		
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		
		try {
			fin = new FileInputStream("src/day22/data/map.txt");
			oin = new ObjectInputStream(fin);
			
			HashMap map = (HashMap)oin.readObject();
			System.out.println(map);
			
			System.out.println("name : " + map.get("name"));
			System.out.println("tel : " + map.get("tel"));
			System.out.println("mail : " + map.get("mail"));
			System.out.println("addr : " + map.get("addr"));
			System.out.println("gen : " + map.get("gen"));
			System.out.println("age : " + map.get("age"));
			System.out.println("height : " + map.get("height"));
			/*
			Collection valueList =  map.values();
			
			Iterator iterator = valueList.iterator();
		   
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			*/
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new MapReadTest();

	}

}
