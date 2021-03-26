package sql;

/*
	�� Ŭ������ ȸ�����̺��� �����ͺ��̽� �۾��� �ʿ���
	���Ǹ���� ��Ƴ��� ������ ��û�ϸ� ���Ǹ���� ��ȯ���ִ�
	����� ���� Ŭ����...
 */

public class MemberSQL {
	public final int SEL_ALL 		= 	1001;
	public final int SEL_ID_INFO 	= 	1002;
	
	public final int EDIT_MEMB		=	2001;
	
	public final int ADD_MEMB 		= 	3001;
	
	// �ʿ��� ���� ����� ����� ���� �ڵ带 ����� �̶� �ڵ尪�� �ٸ��� �����Ѵ�.
	// ���� �ڵ忡 �ش��ϴ� ���Ǹ���� case ���� �߰����ָ� �ȴ�.
	
	// ���� �ڵ尪�� �ش��ϴ� ���Ǹ���� �䱸�ϸ�
	// �ش� ���Ǹ���� ��ȯ���ִ� �Լ�
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("    mno, name, id, mail, tel, gen, avt ano, joindate ");
			buff.append("FROM ");
			buff.append("    member ");
			buff.append("WHERE ");
			buff.append("    isshow = 'Y' ");
			break;
		case SEL_ID_INFO:
			buff.append("SELECT ");
			buff.append("    mno, name, id, mail, tel, gen, avt ano, joindate ");
			buff.append("FROM ");
			buff.append("    member ");
			buff.append("WHERE ");
			buff.append("    isshow = 'Y' ");
			buff.append("    id = ? ");
			break;
		case EDIT_MEMB:
			buff.append("UPDATE ");
			buff.append("    member ");
			buff.append("SET ");
			buff.append("    avt = ? ");
			buff.append("WHERE ");
			buff.append("    id = ? ");
			break;
		case ADD_MEMB:
			buff.append("INSERT INTO ");
			buff.append("    member(mno, name, id, pw, mail, tel, gen, avt) ");
			buff.append("VALUES( ");
			buff.append("    (SELECT NVL(MAX(mno) + 1, 1001) FROM member), ");
			buff.append("    ?, ?, ?, ?, ?, ?, ? ");
			buff.append(")");
			break;
		}
		return buff.toString();
	}
}