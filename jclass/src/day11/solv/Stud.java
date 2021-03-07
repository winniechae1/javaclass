package day11.solv;

public class Stud {
	public String name, id, mail, tell;
	public char gen;
	
	//	출력될 함수 
	public void toPring() {
		System.out.printf("이 름 : %3s, 아이디 : %8s, 메 일 : %20s, 휴대폰 : %13s, 성 별 : %2c", 
				name, id, mail, tell, ((gen == 'M') ? "남자" : "여자"));
	}
}
