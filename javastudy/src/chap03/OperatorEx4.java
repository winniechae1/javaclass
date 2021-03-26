package chap03;
//	부호 연산자 + : 하는일이 없다. - : 음수면 양수로 양수면 음수로 반대의 결과가 출력된다.

public class OperatorEx4 {

	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i);
		
		i = -10;
		i = -i;
		System.out.println(i);
	}

}
