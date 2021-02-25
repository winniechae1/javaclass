package day05_run.ex;
/*
다음 처럼 출력되도록 프로그램을 작성하세요.

11111
22222
33333
44444
55555
------------------------------------------------------
1
22
333
4444
55555

    1
   22
  333
 4444
55555

1
2  3
4  5  6
7  8  9  10  
11 12 13 14  15
*/
public class Extra02 {
	public static void main(String[] args) {
		
		/*
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > 0; j--) {
				if(i+1<j) {
				System.out.print(" ");
				}else 
					System.out.print(k++ + " ");
			}
			
			System.out.println();
		}
		/*
		
		//01
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		//02
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		
		}
		
		//03
		for(int i = 0; i<5; i++) { // 5개 줄 생성
			for(int j = 5; j>0; j--) { 
				if(j>i+1) {
					System.out.print(" ");
				}
				else {
					System.out.print(i+1);
				}
			}
			System.out.println();
		}
		
		//04
		int k =1;
		for(int i = 0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(k++ + " ");	
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < i+1; j++){
				System.out.printf("%2d",(i * (i+1)/2 + 1 + j));
			}
			System.out.println();
		}
		//05
		
		
		//06
		
		*/
		int k=15;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print(k-- + " ");
			}
			System.out.println();
		}
	}
}
