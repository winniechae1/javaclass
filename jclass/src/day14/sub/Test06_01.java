package day14.sub;

public class Test06_01 {

	public Test06_01() {
//		Sub01 s1 = new Sub01();		// 패키지가 다르기 때문에 아니된다.
		Sub02 s2 = new Sub02();
//		s2.no1 = 100; 	//	no1의 접근지정자가 private이기 때문에 안된다.
		s2.no2 = 200;	//	no2의 접근지정자가 생략된 경우(범위가 같은 패키지 + 클래스 내에서 가능)
	}
	public static void main(String[] args) {
		new Test06_01();
	}

}
