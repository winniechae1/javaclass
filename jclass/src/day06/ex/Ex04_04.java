package day06.ex;

/*
	4. 첫날은 1원을 저축하고 다음날은 전날의 2배를 저축한다면 
    	며칠째 1억원을 저축할 수 있는 지 출력해주는 프로그램을 작성하세요.
 */
public class Ex04_04 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int save = 1;
		while(true) {
			
			sum = sum + save;
			save = save * 2;
			if(sum > 1000000000) {
				break;
			}
			System.out.println(save);
		}
	}
}