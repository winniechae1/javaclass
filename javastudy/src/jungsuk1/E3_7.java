package jungsuk1;
/*
 	화씨를 섭씨로 변환하는 코드이다 
 	섭씨는 5/9 * (F-32) 라고 할때 
 	변환 결과값은 소수점 셋째자리에서 반올림해야한다.
 */
public class E3_7 {
	public static void main(String[] args) {
		
		int  f = 100;
		float c = (int)((f-32)*100*5/9f + 0.5) / 100f;
				
		System.out.println("화씨온도 : " + f);
		System.out.println("섭씨온도 : " + c);
	}
}
