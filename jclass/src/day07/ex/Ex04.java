package day07.ex;
/*
 	반지름 5개를 기억한 후
	각각의 반지름을 가진 원의 넓이를 계산하는 프로그램을
	작성하세요.
	원의 넓이 역시 배열로 기억하고 있다가 한번에 출력하도록 하세요.
	==>		float[]	area;
 */
public class Ex04 {
	public static void main(String[] args) {
		float[] rad = new float[5];
		float[] area = new float[rad.length];
		
		for(int i = 0; i < 5; i++) {
			float num = (float)(Math.random() * 5 + 1);
			rad[i] = num;
			float tmp = (float)(num * 3.14);
			area[i] = tmp;
			System.out.println("반지름의 길이 : " + num + "원의 넓이 : " + tmp);
		}
		
	}
}
