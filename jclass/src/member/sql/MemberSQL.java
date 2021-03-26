package member.sql;
/*
 	�� Ŭ������ ȸ�������� ���õ� ���Ǹ���� �����ϴ� Ŭ����
 	@author ������
 	@since 2021.03.19
 	@version v.1.0
 */
public class MemberSQL {
	// ����ڰ� �ʿ��� ���Ǹ���� ��û�� �� ����� �ڵ� ����
	public final int SEL_ID_LIST 	= 1001;
	public final int SEL_ID_INFO 	= 1002;
	public final int SEL_ALL_INFO	= 1003;
	public final int SEL_ALL3_LIST 	= 1004;
	
	
	//	���� ���Ǹ�� ��û �ڵ� 
	public final int EDIT_MAIL 		= 2001;
	public final int EDIT_AVT		= 2002;
	
	//	ȸ�� �߰� ���Ǹ�� ��û �ڵ�
	public final int ADD_MEMB 		= 3001;
	
	//	ȸ�� Ż�� ���Ǹ�� ��û �ڵ� 
	public final int DEL_MEMB_MNO	= 4001;
	public final int DEL_MEMB_ID	= 4002;
	
	//	���� �ڵ带 �Է��ϸ鼭 ȣ���ϸ� �ڵ忡 �´� ���Ǹ���� ��ȯ���ִ� �Լ�
	
	
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		
		case EDIT_AVT:
			buff.append("UPDATE ");
			buff.append("	member ");
			buff.append("SET ");
			buff.append("	avt = ? ");
			buff.append("WHERE ");
			buff.append("	id = ? ");
			break;
		case EDIT_MAIL: 
			buff.append("UPDATE ");
			buff.append("    member ");
			buff.append("SET ");
			buff.append("	 mail = ? ");
			buff.append("WHERE ");
			buff.append("	 id = ? ");
			break;
		case SEL_ID_LIST:
			buff.append("SELECT ");
			buff.append("	id ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			break;
		case SEL_ID_INFO:
			buff.append("SELECT ");
			buff.append("	mno, id, name, mail, tel, gen, avt ano, joindate jdate ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			buff.append("	AND id = ? ");
			break;
		case ADD_MEMB:
			buff.append("INSERT INTO ");
			buff.append("   member(mno, name, id, pw, mail, tel, gen, avt) ");
			buff.append("VALUES( ");
			buff.append("   (SELECT NVL(MAX(mno)+1, 1001) FROM member), ");
			buff.append("   ?, ?, ?, ?, ?, ?, ? ");
			buff.append(") ");
			break;
		
		case SEL_ALL3_LIST:
			buff.append("SELECT ");
			buff.append("	name, id, joindate jdate ");
			buff.append("FROM ");
			buff.append("	member ");
			
			break;
		}
		return buff.toString();
	}
}
