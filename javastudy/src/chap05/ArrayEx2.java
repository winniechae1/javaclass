package chap05;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
		}
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
		}
		
		for(int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);	// iArr3 은 참조변수일뿐 저장하기위한 공간은 아니다.
		System.out.println(chArr);
//		char 배열을 println으로 출력하면 각 요소가 구분자 없이 그대로 출력된다 
//		println() 가 char 배열일때만 이렇게 동작하도록 작성되었기 때문이다.
		
	}

}
