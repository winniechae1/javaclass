package day11;
/*
 	우리반 친구들의 정보를 기억할 클래스를 제작하고 
 	한명씩 정보를 입력해서 출력해보자.
 */
public class Test08 {
	public Test08() {
		
		String[] name = {"전은석", "허수경", "곽채원", "김유진", "신현식"};
		String[] id = {"euns", "soo", "won", "jin", "sin"};
		String[] mail = {"euns@increpas.com","soo@increpas.com","won@increpas.com","jin@increpas.com","sin@increpas.com"};
		String[] tell = {"010-3175-9042", "010-1111-1111", "010-2222-2222", "010-7777-7777", "010-3333-3333"};
		char[] gen = {'M','F','F','F','M'};
		Stud[] stud = new Stud[5];
		
		for(int i = 0; i < stud.length; i++) {
			//	각 방에 인스턴스 만들어서 채워주고 
			stud[i] = new Stud();
			stud[i].name = name[i];
			stud[i].id = id[i];
			stud[i].mail = mail[i];
			stud[i].tell = tell[i];
			stud[i].gen = gen[i];
		}
		Student st = new Student();
		
//		String irum = st.name;
		st.setName("둘리");
		System.out.println()
		
		// 출력
		for(int i = 0; i < stud.length; i++) {
			System.out.println(stud[i].toString());
		}
	}
	public static void main(String[] args) {
		new Test08();
	}

}
