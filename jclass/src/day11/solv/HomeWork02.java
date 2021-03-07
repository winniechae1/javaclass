package day11.solv;

import java.util.*;
/*
 	Student 클래스를 이용해서 >> 함수를 이용해서 접근
 */

/*
 	extra]
 		이름 또는 아이디를 입력하면 해당 친구의 정보를 출력해주는 프로그램을 제작하세요. 
 */
public class HomeWork02 {
	public HomeWork02() {
		//	배열 준비하고 
		Student[] stud = getDataArr();
		//	실행하면 인스턴스와 데이터 모두 채워서 반환해주는 함수를 이미 만들어 뒀으니 
		//	호출만하면 원하는 Student 배열을 얻을 수 있다.
		
		//	출력해준다.
		toPrint(stud);
	}
	
	//	실행처리함수
	public void exec(Student[] st) {
		//	무한 반복해서 친구의 이름을 입력할 것인지 아니면 아이디를 입력할 것인지를 입력 받는다.
		//	이름 입력은 0 번 아이디 입력은 1 번으로 처리하기로 한다. 
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//	메시지 출력
			System.out.print("이름으로 검색은 0번, 아이디로 검색은 1번으로 입력하세요. : " );
			int no = sc.nextInt();
			if(!(no == 0 || no == 1)){
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			
			switch(no) {
			case 0:
				//	이름으로 검색하는 기능 처리 
				
				break;
			case 1:
				//	아이디로 검색하는 기능 처리
				
				break;
			}
		}
	}
	
	//	배열을 입력해서 실행하면 이름을 입력받아서 해당 이름의 학생정보를 출력하는 함수 
	public void nameToInfo(Student[] st) {
		//	입력도구 준비하고 
		Scanner sc = new Scanner(System.in);
		//	메시지 출력
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		//	각 인덱스의 이름을 비교해서 같은 이름이면 정보를 출력해준다.
		for(int i = 0; i < st.length; i++) {
			if(st[i].getName().equals(name)) {
				System.out.println(st[i].toString());
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		new HomeWork02();
	}
	 
	
	//	인스턴스와 데이터 채워주는 함수 
	public Student[] getDataArr() {
		//	반환값 변수 
		Student[] st = new Student[5];
		
		for(int i = 0; i < st.length; i++) {
			st[i] = new Student();
		}
		//	데이터 삽입용 배열 준비
		String[] name =  {"전은석", "허수경", "곽채원", "김유진", "신현식"};
		String[] id = {"euns", "soo", "won", "jin", "sin"};
		String[] mail = {"euns@increpas.com","soo@increpas.com","won@increpas.com","jin@increpas.com","sin@increpas.com"};
		String[] tell = {"010-3175-9042", "010-1111-1111", "010-2222-2222", "010-7777-7777", "010-3333-3333"};
		char[] gen = {'M','F','F','F','M'};
		
		//	데이터 채우기
		for(int i = 0; i < st.length; i++) {
			String irum = name[i];
			String aidi = id[i];
			String juso = mail[i];
			String hp = tell[i];
			char gender = gen[i];
			
			st[i].setName(irum);
			st[i].setId(aidi);
			st[i].setMail(juso);
			st[i].setTell(hp);
			st[i].setGen(gender);
		}
		return st;
	}
	
	//	출력용 함수 
	public void toPrint(Student[] st) {
		for(int i = 0; i < st.length; i++) {
			System.out.println(st[i].toString());
		}
	}
	
	public void toPrint(Student[] st, int idx) {	//	오버로딩 <== 매개변수의 개수가 다르다.
		System.out.println(st[idx].toString());
	}
	
	
	/*
	public String toPrint(Sutdent[] st) {	// 매개변수 리스트의 형태가 같기 때문에 안된다.
		String str = "";
		
		return str;
	}
	*/
}
