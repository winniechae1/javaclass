package chap05;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println("������ - arr.length:" + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:" + arr[i]);
		}
		int[] tmp = new int[arr.length*2];
		
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp;
		System.out.println("������ - arr.length:" + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
	}

}
