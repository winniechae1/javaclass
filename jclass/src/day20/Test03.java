package day20;

/*
 	학생의 이름을 이용해서 점수(java, db, web, jsp, spring, total)를 관리하는 Map을 만들어서 출력해보자.
 */
import static java.lang.Math.*;
import java.util.*;
public class Test03 {
	private HashMap map;
	
	public Test03() {
		map = setData();
		toPrint();
	}
	
	// Map 초기화해주는 함수 
	public HashMap setData() {
		//	반환값 변수 만들기
		//	Map 만들기
		HashMap map = new HashMap();		
		//	데이터 채우기 
		map.put("박용수", new Student("박용수", getScore(), getScore(), getScore(), getScore(), getScore()));
		map.put("윤태성", new Student("윤태성", getScore(), getScore(), getScore(), getScore(), getScore()));
		map.put("허수경", new Student("허수경", getScore(), getScore(), getScore(), getScore(), getScore()));
		map.put("최태현", new Student("최태현", getScore(), getScore(), getScore(), getScore(), getScore()));
		map.put("신현식", new Student("신현식", getScore(), getScore(), getScore(), getScore(), getScore()));
		
		//	Map 반환
		return map;
	}
	
	public void toPrint() {
		Set keys = map.keySet();
		// Iterator로 변환 후 처리
		Iterator itor = keys.iterator();
		
		while(itor.hasNext()) {
			Object o = itor.next();
			Object obj = map.get(o);
			Student stud = (Student) obj;
			// toPrint() 호출
			stud.toPrint();
		}
	}
	//	HashMap을 입력하고 호출하면 맵의 내용을 출력해주는 함수
	public void toPrint(HashMap m) {
		Set set = m.entrySet();
		/*
		 	이 set 안에는 Map.Entry 타입의 데이터가 채워져있다.
		 	Map.Entry는 이를테면 VO 클래스이다.
		 	
		 */
		Iterator itor = set.iterator();
		// 데이터를 하나씩 꺼내서 출력한다.
		while(itor.hasNext()) {
			Object o = itor.next();
			Map.Entry en = (Map.Entry) o;
			
			String key = (String) en.getKey();
			Student val = (Student) en.getValue();
			System.out.println("key : " + key);
			val.toPrint();
//			System.out.println(val);
		}
	}
	// 랜덤하게 점수 반환해주는 함수 
	public int getScore() {
		return (int)(random()*41 +60);
	}

	public HashMap getMap() {
		return map;
	}
	public void setMap(HashMap map) {
		this.map = map;
	}

	
	public static void main(String[] args) {
		new Test03();
	}

}
