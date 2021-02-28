package chap03;

public class gugudanTest {
	public static void main(String[] args) {
		
		System.out.println("--------------Java Run--------------");
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " x " + i + " = " + (i*j)+ "\t");	
			}
			System.out.println();
		}
	}
}
