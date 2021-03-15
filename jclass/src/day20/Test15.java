package day20;
/*
 	학생의 이름을 키값으로 하고 자바점수를 value로 하는 Map을 만들어서 
 	5명의 학생을 기억하고 출력해보자.
 */
import java.util.*;
public class Test15 {

	public Test15() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("루피", 60);
		map.put("상디", 95);
		map.put("조로", 100);
//		map.put('a', 96);	// key값이 문자열이 아니기때문에 에러 발생..
		// 데이터를 꺼내서 출력해보자 
		
		Set<String> set = map.keySet();
		
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String key = itor.next();
			int value = map.get(key);	// Integer 타입으로 꺼내서 int타입으로  unboxxing한다
			
			System.out.println(key + " : " + value);
		}
		System.out.println();
		Set<Map.Entry<String, Integer>> data = map.entrySet();
		//	
		Iterator<Map.Entry<String, Integer>> it = data.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> ent = it.next();
			String key = ent.getKey();
			int val = ent.getValue();
//			String key = it.next().getKey();
//			int val = it.next().getValue();
			
			System.out.println(key + " | " + val);
		}
	}

	public static void main(String[] args) {
		new Test15();
	}

}
