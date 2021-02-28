package chap02;

public class OperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b;
		a = b = 10;
		
		boolean c = ++a > b++ || a++ >= ++b;	// true || true
		
		System.out.println(a + " , " + b); // a = 12 b = 11
		System.out.println("변수 c의 값 :" + c);
		
	}

}
