package day11.solv;

import java.util.*;
/*
 	Student Ŭ������ �̿��ؼ� >> �Լ��� �̿��ؼ� ����
 */

/*
 	extra]
 		�̸� �Ǵ� ���̵� �Է��ϸ� �ش� ģ���� ������ ������ִ� ���α׷��� �����ϼ���. 
 */
public class HomeWork02 {
	public HomeWork02() {
		//	�迭 �غ��ϰ� 
		Student[] stud = getDataArr();
		//	�����ϸ� �ν��Ͻ��� ������ ��� ä���� ��ȯ���ִ� �Լ��� �̹� ����� ������ 
		//	ȣ�⸸�ϸ� ���ϴ� Student �迭�� ���� �� �ִ�.
		
		//	������ش�.
		toPrint(stud);
	}
	
	//	����ó���Լ�
	public void exec(Student[] st) {
		//	���� �ݺ��ؼ� ģ���� �̸��� �Է��� ������ �ƴϸ� ���̵� �Է��� �������� �Է� �޴´�.
		//	�̸� �Է��� 0 �� ���̵� �Է��� 1 ������ ó���ϱ�� �Ѵ�. 
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//	�޽��� ���
			System.out.print("�̸����� �˻��� 0��, ���̵�� �˻��� 1������ �Է��ϼ���. : " );
			int no = sc.nextInt();
			if(!(no == 0 || no == 1)){
				System.out.println("�߸� �Է��߽��ϴ�.");
				continue;
			}
			
			switch(no) {
			case 0:
				//	�̸����� �˻��ϴ� ��� ó�� 
				
				break;
			case 1:
				//	���̵�� �˻��ϴ� ��� ó��
				
				break;
			}
		}
	}
	
	//	�迭�� �Է��ؼ� �����ϸ� �̸��� �Է¹޾Ƽ� �ش� �̸��� �л������� ����ϴ� �Լ� 
	public void nameToInfo(Student[] st) {
		//	�Էµ��� �غ��ϰ� 
		Scanner sc = new Scanner(System.in);
		//	�޽��� ���
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		
		//	�� �ε����� �̸��� ���ؼ� ���� �̸��̸� ������ ������ش�.
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
	 
	
	//	�ν��Ͻ��� ������ ä���ִ� �Լ� 
	public Student[] getDataArr() {
		//	��ȯ�� ���� 
		Student[] st = new Student[5];
		
		for(int i = 0; i < st.length; i++) {
			st[i] = new Student();
		}
		//	������ ���Կ� �迭 �غ�
		String[] name =  {"������", "�����", "��ä��", "������", "������"};
		String[] id = {"euns", "soo", "won", "jin", "sin"};
		String[] mail = {"euns@increpas.com","soo@increpas.com","won@increpas.com","jin@increpas.com","sin@increpas.com"};
		String[] tell = {"010-3175-9042", "010-1111-1111", "010-2222-2222", "010-7777-7777", "010-3333-3333"};
		char[] gen = {'M','F','F','F','M'};
		
		//	������ ä���
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
	
	//	��¿� �Լ� 
	public void toPrint(Student[] st) {
		for(int i = 0; i < st.length; i++) {
			System.out.println(st[i].toString());
		}
	}
	
	public void toPrint(Student[] st, int idx) {	//	�����ε� <== �Ű������� ������ �ٸ���.
		System.out.println(st[idx].toString());
	}
	
	
	/*
	public String toPrint(Sutdent[] st) {	// �Ű����� ����Ʈ�� ���°� ���� ������ �ȵȴ�.
		String str = "";
		
		return str;
	}
	*/
}
