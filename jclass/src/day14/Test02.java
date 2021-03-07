package day14;

public class Test02 {

	public static int no = 1;	// 1
	public int num = 2;	// 명시적 초기화 
	
	{	// 초기화 블럭을 이용
		no = 10;	// 2
		num = 20;
	}
	
	static {	// static 블럭을 이용 : static 멤버에 한해서만 초기화
		no = 50;	// 3
//		num = 50;	--static 멤버가 아니기 때문에 에러  
	}
	public Test02() {
		/*
		num = 100;
		no = 200;	// 생성자 함수를 이용
		*/
		System.out.println("no : " + no);	// 1 -> 3 -> 2 순으로 초기화가 이루어진다.
		System.out.println("num : " + num);
	}

	public static void main(String[] args) {
		new Test02();
		System.out.println("no : " + no);
//		System.out.println("num : " + num);	
	}

}
