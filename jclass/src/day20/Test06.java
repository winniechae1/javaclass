package day20;

import java.util.*;
public class Test06 {
	private TreeMap map;
	
	public Test06() {
		setData();
		printMap();
	}
	public void setData() {
		map = new TreeMap();
		map.put("·çÇÇ", 17);
		map.put("³ª¹Ì", 19);
		map.put("·Îºñ", 27);
		map.put("ÃÝÆÄ", 10);
		map.put("¿ì¼Ù", 17);
	}
	public void printMap() {
		Set set = map.keySet();
//		TreeSet keys = new TreeSet(set);
		
		ArrayList list = new ArrayList(set);
		for(Object o : list) {
			System.out.println((String) o + " : " + map.get(o));
		}
	}
	public TreeMap getMap() {
		return map;
	}

	public void setMap(TreeMap map) {
		this.map = map;
	}

	public static void main(String[] args) {
		new Test06();
	}

}
