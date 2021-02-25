package day02;

public class Test08 {

	public static void main(String[] args) {
		int no = 20;
		System.out.println("1. no : " + no++); // 20
		System.out.println("2. no : " + ++no); // 22
		System.out.println("3. no : " + no);
		
		int num = 30;
		System.out.println("4. num : " + num--);
		System.out.println("5. num : " + ++num);
		
		int a = 10;
		int b = ++a + ++a; 
		System.out.println("6. b : " + b);
		int a1 = 10;
		int b1 =  ++a1 + a1++;
		System.out.println("7. b1 : " + b1);
		int a2 = 10;
		int b2 =  a2++ + a2++;
		System.out.println("8. b2 : " + b2);
	}

}
