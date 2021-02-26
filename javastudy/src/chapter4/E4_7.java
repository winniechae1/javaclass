package chapter4;
// 1 ~ 6 사이의 임의의 정수를 value 에 저장하는 프로그램을 출력하세요.
public class E4_7 {

	public static void main(String[] args) {
		
		int value = (int)(Math.random() * 6 + 1);
		System.out.println("value : " + value);
	}

}
