package day14;
/*
 	Grand Ŭ������ ����� 
 	Father
 	Son
 */
public class Test04 {

	public Test04() {
//		Father f = new Father();
//		Son s = new Son();
//		Grand g = new Father();  // Father Ŭ������ �ν��Ͻ��� Grand�� ����� ������ �����Ƿ� �����ϴ�.
//		Father f = (Father) new Grand();
//		Father f = new Son();
//		Grand g = new Son(); 
//		Son s = new Son();	// ���۷���(Son s) +  �ν��Ͻ�(new Son()) ==> ������Ʈ(��ü, Object)
		
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
