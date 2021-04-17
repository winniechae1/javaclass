package member.dao;

/**
 * �� Ŭ������ ȸ���� ���õ� �����ͺ��̽� �۾��� �����ؼ� ó���ϴ� Ŭ����
 * @author class02
 *
 */

import java.sql.*;
import java.util.*;

import db.*;
import member.sql.*;
import member.vo.*;

public class MemberDao {
	// ��Ŭ������ �����ͺ��̽� �۾� ���� Ŭ�����̱� ������
	// �� Ŭ������ ��ü�� �Ǵ� ���� �����ͺ��̽� �۾��� �� �غ� �Ǿ�� �ڴ�.
	private MyJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// ���Ǹ�� Ŭ����
	private MemberSQL mSQL;
	
	public MemberDao() {
		db = new MyJDBC();
		// �̷��� MyJDBC�� �����ڸ� ȣ���ϴ� ���� 
		// ����Ŭ ����̹��� �ε��� �������°� �ȴ�.
		
		// ���� ���Ǹ���� ����� �� �ֵ��� ���Ǹ�� Ŭ������ �޸𸮿� �ø���.
		mSQL = new MemberSQL();
	}

	/**
	 *  ȸ������ ���̵� ����Ʈ ��ȸ ���� ó���Լ�
	 */
	public ArrayList<String> getIdList(){
		// ��ȯ�� ����
		ArrayList<String> list = new ArrayList<String>();
		/*
			�� �Լ��� ����Ŭ�� �����ؼ� 
			ȸ���� ���̵� ��ȸ�ؼ� 
			�� ����� ��ȯ���ִ� �Լ�
			���� �����ͺ��̽��۾��� �ؾ� �ϴµ�
			1. ���� ������ �ϰ�
			2. ���Ǹ���� �����ͼ�
			3. Statement�� �Ǿ 
			4. jdbc���� �����ϸ�
			5. ����� ��ȯ�����ٵ� �� ����� �޾Ƽ� ��ȯ���ָ� �ȴ�.
		 */
		// 1. ����
		con = db.getCon(); // ����Ŭ�� ������ �ϳ� ���� ����
		// 2. ���Ǹ��
		String sql = mSQL.getSQL(mSQL.SEL_ID_LIST);
		/*
			���Ǹ���� MembeSQL Ŭ������ ��� ����� �װ�
			�ʿ��� ���Ǹ���� ��û�� �ϸ� ��ȯ�� ���� ���̴�.
			�̶� �ʿ��� ���Ǹ�� �ڵ� ���� MemberSQL �ȿ� ����� ������
			������ ����ϱ⸸ �ϸ� �ȴ�.
		 */
		  
		// ���Ǹ�ɿ� ? (ä���� �� ������)�� �����Ƿ� Statement�� ó���Ѵ�.
		stmt = db.getSTMT(con);
		
		try {
			// ���� �ʿ��� ���Ǹ���� �̹� �ϼ��� ������ ���Ǹ���̱� ������
			// ���Ǹ���� �����͸� ä���� �ϼ��ϴ� �۾��� �ʿ����� �ʴ�.
			// ���Ǹ���� ������ ����ް�...
			// �غ�� ������ ��� �޴´�.
			rs = stmt.executeQuery(sql);
			/*
				Statement�� ���ο� ���Ǹ���� ��������ʰ� �ֱ� ������
				���Ǹ���� �Ǿ jdbc���� ������ �ϰ�
				PreparedStatement �� ���� ���鶧 ���Ǹ���� ������ �����ͼ� 
				��������Ƿ� �̹� ���ο� ���Ǹ���� ����ִ�.
				���� �Ǿ ������ �ʾƵ� �ȴ�.
			 */
			
			/*
				ResultSet�� �ζ������̺��� ������ �� ���ڵ������Ͱ�  BOF�� �ְ�
				���� �����͸� ������ ���� �����̴�.
				�׷��� �츮�� ���ڵ������͸� ���� ������ �� ���� �ʵ��� �����͸� ���¾���.
				
				�̶�
				 rs.next() �Լ��� ȣ���ؼ� ���ڵ� �����͸� ���� ������ ���Ⱦ��µ�
				 next()�Լ��� ��ȯ���� boolean Ÿ���̴�.
				 �ǹ̴� ���� ������ �����µ� �����ϸ� true �� ��ȯ���ְ�
				 							 �����ϸ� false�� ��ȯ�Ѵ�.
				 							 
				 ���� ���Ǹ���� ����� ����������(����������) �߻��ϴ� ����
				 �ݺ������� ó���ؾ� ���ٵ� �̶� �ݺ����� ���ǽĿ� next() �Լ��� ����ϸ� �� ���̴�.
			 */
			while(rs.next()) {
				// EOF �� �̵��ϴ� ���� �� �ݺ����� ���ᰡ �ȴ�.
				// �� �ݺ����� ���Ǹ���� ��� ������� ȸ������ ���̵� 
				// ����Ʈ�� ��� �۾��� �ϴ� �ݺ����̴�.
				
				// ���̵� ������
				String sid = rs.getString("id");
				// ���̵� ����Ʈ�� ���
				list.add(sid);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		// ������ ��ȯ�ϰ�
		return list;
	}
	
	
//	  5)  "ano"�� �Է��ϸ� �ƹ�Ÿ ��ȣ�� �Է¹޾� �ƹ�Ÿ��ȣ �������ִ� ���
	public void editAno(String id, int ano) {
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.EDIT_AVT);
		pstmt = db.getPSTMT(con, sql);
		
		try {
			pstmt.setInt(1, ano);
			pstmt.setString(2, id);
			pstmt.executeQuery();
			System.out.println("�ƹ�Ÿ ��ȣ������ �Ϸ��߽��ϴ�.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
	}
	
//		4) "mail"�� �Է��ϸ� ���̵�� ���ο� ������ �Է¹޾Ƽ� ȸ���� ������ �������ִ� ���
	   public void editMail(String id, String mail) {
	      con = db.getCon();
	      String sql = mSQL.getSQL(mSQL.EDIT_MAIL);
	      pstmt = db.getPSTMT(con, sql);
	      
	      try {
	         pstmt.setString(1, mail);
	         pstmt.setString(2, id);
	         pstmt.executeQuery();
	         System.out.println("���ϼ����� �Ϸ��߽��ϴ�.");
	      } catch(Exception e) {
	         e.printStackTrace();
	      } finally {
	         db.close(pstmt);
	         db.close(con);
	      }
	
	   }
//		3) "add"�� �Է��ϸ� ȸ���� ������ �Է¹޾Ƽ� ȸ�������� ó�����ִ� ���
	   public void addMember() {
		   try {
			   con = db.getCon();
			   String sql = mSQL.getSQL(mSQL.ADD_MEMB);
			   pstmt = db.getPSTMT(con, sql);

			   Scanner sc = new Scanner(System.in);
			   System.out.println();

			   System.out.print("�̸� �Է� >");
			   String name = sc.nextLine();
			   System.out.print("���̵� �Է� >");
			   String id = sc.nextLine();
			   System.out.print("��й�ȣ �Է� >");
			   String pw = sc.nextLine();
			   System.out.print("���� �Է� >");
			   String mail = sc.nextLine();
			   System.out.print("��ȭ��ȣ �Է� >");
			   String tel = sc.nextLine();
			   System.out.print("���� �Է� >");
			   String gen = sc.nextLine();
			   System.out.print("�ƹ�Ÿ ��ȣ �Է� >");
			   int avt = sc.nextInt();

			   pstmt.setString(1, name);
			   pstmt.setString(2, id);
			   pstmt.setString(3, pw);
			   pstmt.setString(4, mail);
			   pstmt.setString(5, tel);
			   pstmt.setString(6, gen);
			   pstmt.setInt(7, avt);

			   int cnt = pstmt.executeUpdate();

			   if(cnt == 1) {
				   System.out.println("������ �����߽��ϴ�.");
			   } else {
				   System.out.println("������ �����߽��ϴ�.");            
			   }
			   
		   } catch(Exception e) {
			   e.printStackTrace();
		   } finally{
			   try {
				   pstmt.close();
				   con.close();
			   } catch(Exception e) {}
		   }
	   }
//	2) "id"�� �Է��ϸ� ȸ������ ���̵� ����Ʈ�� �����ְ� ���̵� �Է¹޾Ƽ� �ش� ȸ���� �����������ִ� ���	
	   public MemberVO getMemberInfo(String id) {
		   // ��ȯ�� ����
		   MemberVO mVO = new MemberVO();
		   
		   // 1. Ŀ�ؼ� ������
		   con = db.getCon();
		   
		   // 2. ���Ǹ�� ��������
		   String sql = mSQL.getSQL(mSQL.SEL_ID_INFO);
		   
		   // 3. PreparedStatement ��������
		   pstmt = db.getPSTMT(con, sql);
		   
		   // ���� �� ���´� ���Ǹ���� �ϼ����� ���� �����̹Ƿ�
		   // ���Ǹ���� �ϼ����ش�.
		   try {
			   // ������ä���� ���Ǹ�� �ϼ�
			   pstmt.setString(1, id);
			   // ���� ���Ǹ���� �ϼ��� ��� ������ ����� ����.
			   rs = pstmt.executeQuery();
			   // ���ڵ������͸� BOF���� ���� ������
			   rs.next();
			   // ������ ������ VO �� ���
			   mVO.setMno(rs.getInt("mno"));
			   mVO.setName(rs.getString("name"));
			   mVO.setId(rs.getString("id"));
			   mVO.setMail(rs.getString("mail"));
			   mVO.setTel(rs.getString("tel"));
			   mVO.setGen(rs.getString("gen").equals("M") ? "����" : "����");
			   mVO.setAno(rs.getInt("ano"));
			   mVO.setJdate(rs.getDate("jdate"));
			   mVO.setJtime(rs.getTime("jdate"));
			   
		   } catch(Exception e) {
			   e.printStackTrace();
		   } finally {
			   db.close(rs);
			   db.close(pstmt);
			   db.close(con);
		   }
		   // ������ ��ȯ
		   return mVO;
	   }
	   
//		1) "l"�� �Է��ϸ� ȸ������ ȸ���̸�, ���̵�, �������� ��ȸ�ؼ� �����ִ� ���α׷� 
	   public ArrayList<MemberVO> getMemberList(){
		   ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		   
		   con = db.getCon();
		   String sql = mSQL.getSQL(mSQL.SEL_ALL3_LIST);
		   pstmt = db.getPSTMT(con, sql);
		   
		   try {
			   rs = pstmt.executeQuery();
			   
			   while(rs.next()) {
				   MemberVO mvo = new MemberVO();
				   mvo.setName(rs.getString("name"));
				   mvo.setId(rs.getString("id"));
				   mvo.setJdate(rs.getDate("jdate"));
				   
				   list.add(mvo);
			   } 
		   } catch (Exception e) {
			   e.printStackTrace();
		   } finally {
			   db.close(rs);
			   db.close(pstmt);
			   db.close(con);
		   }
		   return list;
	   }
	   
}
