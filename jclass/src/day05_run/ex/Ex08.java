package day05_run.ex;
/*
문제 8 ]
	3 ~ 100 사이의 숫자를 랜덤하게 발생시켜서
	발생된 숫자가 솟수인지를 판단해서 출력해주는 프로그램을 작성하세요.
	
	참고 ]
		솟수 : 1과 자기자신으로만 나눌수 있는 수
		
		예 ]
			2, 3, 5, 7, ....
*/
public class Ex08 {
	public static void main(String[] args) {
		
		int no = (int)(Math.random() * (100-3+1)+3);
		String result = "소수입니다.";
		
		for(int i=2; i<no; i++) {
			if(no%i == 0) {
				result = "소수가 아닙니다.";
				break;
			}
		}
		System.out.println(no+" 는"+result);
	}
	
}
