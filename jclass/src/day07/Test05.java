package day07;
/*
 	1	2	3	4	5
 	6	7	8	9	10
 	.....
 */
public class Test05 {
	public static void main(String[] args) {
		// 사용할 내용을 담고 있는 변수를 만들어서 해결하는 방법
		int num = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("   "+ num++);
			}
			System.out.println();
		}
		System.out.println();
		// 카운트 변수를 활용하는 방법
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				int no = 5 * i + 1 * j + 1; 	// a * i + b * j + c
				System.out.print(no + "  ");
			}
			System.out.println();
		}
		
	}
}
