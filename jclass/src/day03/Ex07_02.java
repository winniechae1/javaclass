package day03;

/*
	문제 7]
		숫자 3개를 임의로 발생한 후 가장 큰 숫자만 선택해서 출력하는 프로그램을 작성하세요. 
		단, 3항 연산자를 사용해서 처리하세요. 
		(옵션 - 조건문으로 처리)

	* 선생님 풀이 if 문으로 처리 
*/
public class Ex07_02 {

public static void main(String[] args) {
	// 랜덤한 정수를 3개 발생시켜서 변수에 기억
	int no1 = (int)(Math.random() * 45 + 1);
	int no2 = (int)(Math.random() * 45 + 1);
	int no3 = (int)(Math.random() * 45 + 1);
	
	// 비교하기
	/*
	 	no1 > no2 경우
	 		no1 이 no3 보다 큰 경우 
	 		no1 이 no3 보다 작은 경우 
	 */
	int max = 0;
	
	if(no1 > no2) {
		// 참고] 조건문 역시 중첩해서 사용할 수 있다.
		if (no1 > no3) {
			max = no1;
		}
		else {
			max = no3;
		}
	}
	else { // no2가  no1보다 큰 경우이다. 
		   // 따라서 큰 수는 no2와 no3를 비교하면 해결된다.
		if(no2 > no3) {
			max = no2;
		}
		else {	// no3 가 no2 보다 큰 경우이다. 
				// no2는 no1보다 크므로 no3가 제일 큰 수이다.
			max = no3;
		}
	}
	System.out.println("입력된 세 정수" + no1 + ", " + no2 + ", " + no3 + 
								" 중 제일 큰 수는 " + max + " 입니다.");
}

}