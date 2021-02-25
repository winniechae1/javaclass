package day05_run.ex;
/*


2 x 1  = 2 		3 x 1 = 3		4 x 1 = 4		5 x 1 = 5
2 x 2  = 4		3 x 2 = 6		4 x 2 = 8		5 x 2 = 10
...  
2 x 9  = 18		3 x 9 = 27		4 x 9 = 36		5 x 9 = 45

6 x 1 = 6		7 x 1 = 7		8 x 1 = 8		9 x 1 = 9
...

*/
public class Extra03 {
	public static void main(String[] args) {
		/*
		int gop;
		int dan;
		for(gop= 1; gop< 10; gop++) {
			for(dan = 2; dan< 6; dan++) {
				System.out.print(dan + " x " + gop + " = " + (dan * gop));
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(gop = 1; gop<10; gop++) {
			for(dan = 6; dan<10; dan++) {
				System.out.print(dan + " x " + gop + " = " + (dan * gop));
				System.out.print("  ");
			}
				System.out.println();
		}
		*/
		
		for(int dan = 2; dan <= 5; dan++) {
			for(int gop = 1; gop < 10; gop++) {
				for(int i = 2; i < 6; i++) {
					System.out.print(i + " x " + gop + " = " + (i * gop));
				}
				System.out.println();
			}	
			dan +=4;
		}
		System.out.print("----------------------------------------------------------");
		
}   
}