package day05_run.ex;
/*
extra 01 ]

*
**
***
****
*****
----------------------------------------------

*****
****
***
**
*
-------------------------------------------------
	    *
	   **
	  ***
	 ****
	*****

 *****
  ****
   ***
    **
     *
---------------------------------------------------

Ȧ���� �Է��ϸ� �� ���� �ش��ϴ� ������ ������ִ� ���α׷� 
��] 3�� �Է��ϸ� 
	 *
	***
	 *
	    *
	   ***
	  *****
	 *******
	  *****
	   ***
	    *
*/
public class Extra01 {
	public static void main(String[] args) {
		/*
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<3-i; j++) {
					System.out.print(" ");
			}
			for(int j = 0; j<2*i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		/*
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j = 5; j>2*i; j--)
				System.out.print("*");
			System.out.println();
		}
		*/
		
	for(int i = 0; i<4; i++) {
		for(int j =3; j>i; j--) {
			System.out.print(" ");
			}
		for(int j = 1; j<=2*i+1; j++)
			System.out.print("*");
		System.out.println();
	}
	
	for(int i = 0; i<3; i++) {
		for(int j = 0; j<=i; j++) {
			System.out.print(" ");
		}
		for(int j = 5; j>2*i; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
		
		
		
		
		
		/*
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
		for(int i = 0; i<5; i++) {
			for(int j = 5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if(j<4-i) {
					System.out.print(" ");
				}else 
					System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if(j<i) {
					System.out.print(" ");
				}else
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	}

}
