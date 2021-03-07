package day14;
/*
 	Grand 클래스를 만들고 
 	Father
 	Son
 */
public class Test04 {

	public Test04() {
//		Father f = new Father();
//		Son s = new Son();
//		Grand g = new Father();  // Father 클래스의 인스턴스는 Grand의 멤버를 가지고 있으므로 가능하다.
//		Father f = (Father) new Grand();
//		Father f = new Son();
//		Grand g = new Son(); 
//		Son s = new Son();	// 레퍼런스(Son s) +  인스턴스(new Son()) ==> 오브젝트(객체, Object)
		
//		Father f = s;
//		Grand g = s;
//		g.abc();
		Father f = new Father();
		Grand g = f;
		g.abc();
		System.out.println("g.no : " + g.no);

	}

	public static void main(String[] args) {
		new Test04();
	}

}
