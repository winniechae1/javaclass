package chap11;
//	정렬할 필요가 없다 TreeSet은 이미 정렬하면서 나열하기 때문이다.
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45)+1;
			set.add(num);
		}
		System.out.println(set);
	}

}
