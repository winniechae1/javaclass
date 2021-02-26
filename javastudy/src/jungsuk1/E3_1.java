package jungsuk1;
/*
 	다음 연산의 결과를 적으시오.
 */

public class E3_1 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 의 문자코드는
		System.out.println(1 + x << 33);  // int는 32비트, 따라서 1+x 는 1번만 shift .. 3 * 2 ^ 1 == 6
		System.out.println(y >= 5 || x < 0 && x > 2); // true (&& > ||)
		System.out.println(y += 10 - x++);	// 13
		System.out.println(x+=2); // 5
		System.out.println( !('A' <= c && c <='Z') ); // false
		System.out.println('C'-c);	// 2
		System.out.println('5'-'0');	// 
		System.out.println(c+1);	// 66
		System.out.println(++c);	// 'B'
		System.out.println(c++);	// 'B'
		System.out.println(c);	// 'C'
	}

}
