package chapter4;
/*
 	숫자로 이루어진 문자열 str이 있을때 각 자리의 합을 더한 결과를 출력하세요.
 	"12345" 라면 '1+2+3+4+5' 의 결과인 15를 출력하세요.
 */
public class E4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0'; // 문자 '0' 을 숫자 0 으로 변환하는 방법
		}
		System.out.println("sum = " + sum);

	}

}
