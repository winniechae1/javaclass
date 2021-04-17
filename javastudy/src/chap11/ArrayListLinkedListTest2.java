package chap11;
import java.util.*;
public class ArrayListLinkedListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList(1000000);
		LinkedList l1 = new LinkedList();
		add(a1);
		add(l1);
		
		System.out.println("= ���ٽð��׽�Ʈ =");
		System.out.println("ArrayList :" + access(a1));
		System.out.println("LinkedList :" + access(l1));
	}
	public static void add(List list) {
		for(int i = 0; i < 1000000; i++)
			list.add(i+"");
	}
	public static long access(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i <100000; i++)
			list.get(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
}
