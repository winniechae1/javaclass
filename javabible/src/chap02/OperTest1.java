package chap02;

public class OperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		System.out.println(++a);	// 11
		
		System.out.println(++a + b++); // 12 + 20 
		
		System.out.println((++a % 3) + (a * ++b)); // 13 % 3 = 1,  13  * 22    
		
	}

}
