package day07.ex;
/*
 	3	6	9	12	15
 	18	21	24	27	30
 	.....
 */
public class Ex00 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				int no = 15 * i + 3 * j + 3;
				System.out.print(no + "	");
			}
			System.out.println();
		}

	}

}
