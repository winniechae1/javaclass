package day14;

import day14_01.Test00;
import day14.sub.*;
/*
 	import�� Ŭ������ ��������� �����ϴ� ���� �켱�Ѵ�.
 */
public class Test07 {

	public Test07() {
		Test00 t = new Test00();
		day14.sub.Test00 t2 = new day14.sub.Test00();
		
		day13.Test07 t3 = new day13.Test07();
		System.out.println("day13.Test07.calc(): " + (t3.calc()));
	}

	public static void main(String[] args) {
		new Test07();
	}

}
