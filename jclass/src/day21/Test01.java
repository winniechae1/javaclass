package day21;

import java.util.*;

public class Test01 {
/*
 	제너릭스 선언의 와일드카드 
 	어떤 함수가 제너릭 선언된 컬렉션을 매개변수로 받을 때 자기자신 이외의 
 	다른 클래스로 제너릭 선언된 것도 받을 수 있도록 한다.
 */
	public Test01() {
		
	}
	
	public void abc(ArrayList<Father> l) {
		
	}
	public static void main(String[] args) {
		new Test01();
	}

}

class Grand {
	
}

class Father extends Grand {
	
}

class Son extends Father {
	
}