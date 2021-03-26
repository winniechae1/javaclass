package member.controller;

/*
	���Ե� ȸ���� ���̵���� ��ȸ�ؼ� ����ϰ�
	���̵� �Է��ؼ� �ش� ���̵� ȸ���� ������ ����غ���.
	
	�� Ŭ������ ���� ��ǰ�� �̿��ؼ� ���α׷��� �����ϴ� Ŭ�����̴�.
	
	------------------------------------------------------------------------
	1) "l"�� �Է��ϸ� ȸ������ ȸ���̸�, ���̵�, �������� ��ȸ�ؼ� �����ִ� ���α׷��� 
	2) "id"�� �Է��ϸ� ȸ������ ���̵� ����Ʈ�� �����ְ� ���̵� �Է¹޾Ƽ� �ش� ȸ���� ������
		�����ִ� ���
	3) "add"�� �Է��ϸ� ȸ���� ������ �Է¹޾Ƽ� ȸ�������� ó�����ִ� ���
	4) "mail"�� �Է��ϸ� ���̵� �Է¹޾Ƽ� ȸ���� ������ �������ִ� ���
	5) "ano"�� �Է��ϸ� �ƹ�Ÿ ��ȣ�� �Է¹޾� �ƹ�Ÿ��ȣ �������ִ� ���
	q�� �Է��ϸ� ���α׷� ����
 */

// ***** ������� �ϼ����ּ��� *****
// ���� ������ ������� ��� �ϼ��� ������ �����ϰڽ��ϴ�.

import java.util.*;

import member.dao.*;
import member.vo.*;
public class Member {
	// �� Ŭ���������� �����ͺ��̽� �۾��� �ϴ� ����� �Լ��� �����ؼ� �� �����̴�.
	// ���� �����ͺ��̽� �۾� ���� Ŭ������ �����ͼ� ����ؾ� �Ѵ�.
	
	private MemberDao mDao;
	
	public Member() {
		mDao = new MemberDao();
		Scanner sc = new Scanner(System.in);
//		getInfo(sc);
		
		exec(sc);
	}
	//	��ü ��� ó���Լ�
	public void exec(Scanner sc) {
		StringBuffer buff = new StringBuffer();
		buff.append("�۾��� �����ϼ���!");
		buff.append("\n\t��üȸ�� ��� : l");
		buff.append("\n\tid�� ������ȸ : id");
		buff.append("\n\tȸ������ ó�� : add");
		buff.append("\n\tȸ������ ���� : mail");
		buff.append("\n\tȸ���ƹ�Ÿ ���� : ano");
		buff.append("\n\t���α׷� ���� : q");
		buff.append("");
		buff.append("\n�ڵ� ���� : ");
		// ���α׷��� ���� �������� �𸣹Ƿ� ���ѹݺ��ؾ��Ѵ�.
		loop:
		for(;;) {
			System.out.print(buff);
			String code = sc.nextLine();
			switch(code) {
			case "q":
				System.out.println("���α׷� ����");
				break loop;
			case "l":
				showMemberList();
				break;
			case "add":
				addMember(sc);
				break;
			case "mail":
				editMail(sc);
				break;
			case "ano":
				editAno(sc);
				break;
				
			}
		}
	}
	
	//	ȸ���� ���̵�� ������ �Է¹޾Ƽ� �������ִ� �Լ� 
	public void editMail(Scanner sc) {
		System.out.print("���̵� �Է� : ");
		String id = sc.nextLine();
		System.out.print("���� �Է� : ");
		String mail = sc.nextLine();
		mDao.editMail(id, mail);
	}
	//	ȸ���� �ƹ�Ÿ ��ȣ�� �̿��ؼ�
	public void editAno(Scanner sc) {
		System.out.print("���̵� �Է� : ");
		String id = sc.nextLine();
		System.out.print("�ƹ�Ÿ ��ȣ �Է� : ");
		int ano = sc.nextInt();
		mDao.editAno(id,ano);
	}
	//	ȸ������ ó���Լ�
	   public void addMember(Scanner sc) {
		      mDao.addMember();
		   }
	
	//	��� ȸ�� ����Ʈ �����ִ� �Լ�
	public void showMemberList() {
		ArrayList<MemberVO> list = mDao.getMemberList();
		
		for(MemberVO vo : list) {
			System.out.println("name : " + vo.getName() + ", id : " + vo.getId() + ", jdate" + vo.getJdate());
		}
		
	}
	
	

	
	// ���̵� ����Ʈ �����ͼ� ������ִ� �Լ�
	public void getIdList() {
		ArrayList<String> idList = mDao.getIdList();
		// MemberDao�� �ִ� getIdList() �Լ��� ���̵𸮽�Ʈ�� ���������ٵ�
		// �� Ŭ���������� �� �������ִ� �����͸� ����ؼ� ����ϸ� �ȴ�.
		
		System.out.print("| ");
		for(int i = 0 ; i < idList.size(); i++ ) {
			System.out.print(idList.get(i) + " | ");
		}
		System.out.println();
		
	}
	
	// ���̵� �Է¹޾Ƽ� �ش���̵��� ������ ������ִ� �Լ�
	public void getInfo(Scanner s) {
		while(true) {
			getIdList();
			System.out.println();
			// ���� �޼��� ����ϰ�
			System.out.print("��ȸ�� ���̵� : ");
			String sid = s.nextLine();
			if(sid.equals("q")) {
				break;
			}
			
			MemberVO mVO = mDao.getMemberInfo(sid);
			System.out.println(mVO);
		}
	}
	
	// "l"�� �Է�
	public static void main(String[] args) {
		new Member();
	}

}