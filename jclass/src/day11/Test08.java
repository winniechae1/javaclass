package day11;
/*
 	�츮�� ģ������ ������ ����� Ŭ������ �����ϰ� 
 	�Ѹ� ������ �Է��ؼ� ����غ���.
 */
public class Test08 {
	public Test08() {
		
		String[] name = {"������", "�����", "��ä��", "������", "������"};
		String[] id = {"euns", "soo", "won", "jin", "sin"};
		String[] mail = {"euns@increpas.com","soo@increpas.com","won@increpas.com","jin@increpas.com","sin@increpas.com"};
		String[] tell = {"010-3175-9042", "010-1111-1111", "010-2222-2222", "010-7777-7777", "010-3333-3333"};
		char[] gen = {'M','F','F','F','M'};
		Stud[] stud = new Stud[5];
		
		for(int i = 0; i < stud.length; i++) {
			//	�� �濡 �ν��Ͻ� ���� ä���ְ� 
			stud[i] = new Stud();
			stud[i].name = name[i];
			stud[i].id = id[i];
			stud[i].mail = mail[i];
			stud[i].tell = tell[i];
			stud[i].gen = gen[i];
		}
		Student st = new Student();
		
//		String irum = st.name;
		st.setName("�Ѹ�");
		System.out.println();
		
		// ���
		for(int i = 0; i < stud.length; i++) {
			System.out.println(stud[i].toString());
		}
	}
	public static void main(String[] args) {
		new Test08();
	}

}
