package day08.solv;
/*
1
2  3
4  5  6
7  8  9  10  
11 12 13 14  15
 */

public class D05_Ex03 {
	public static void main(String[] args) {
		int no = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(no++);
			}
			System.out.println();
		}
	}
}
