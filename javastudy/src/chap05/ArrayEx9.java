package chap05;

// ������ ������ �迭 ä��� 
import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] code = {-4, -1, 3, 6, 11};
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp];
		}
		System.out.println(Arrays.toString(arr));
	}

}