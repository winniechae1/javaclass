package db;
/*
 	�� Ŭ������ ������ JDBC �۾��� �� �� �ʿ��� ������ ��ǰ�� ���� �����̴�.
 	
 	��, JDBC �۾��� �ݺ����� �۾��� ���� ���ԵǾ� �ִ�.
 	�� �۾��� �� �� ���ϰ� �ϱ� ���ؼ� ������ ��ǰ�� ���� ����� �����̴�.
 	(==> �ݺ� �۾��� �ڵ����� ���ִ� ����� ���� ����)
 */
import java.sql.*;

public class MyJDBC {
	String url, id, pw;
	
	public MyJDBC() {
		// hello �������� �� Ŭ������ ��ü�� ������ִ� ������ �Լ� 
		this("jdbc:oracle:thin:@localhost:1521:xe","hello","increpas");
	}
	public MyJDBC(String url,String id, String pw) {
		try {
			//	����̹� �ε��ϰ� 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//	����̹� �ε��� ������ ���� �� Ŭ������ ����������� ����� ���̴�.
			//	���� url, id, pw �� ����ϴ� �۾��� �ʿ���� �ȴ�.
			//	����̹��� �ε��� �����ϸ� ����ϵ��� �ڵ��ϵ��� �Ѵ�.
			this.url = url;
			this.id = id;
			this.pw = pw;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//	Connection�� ��ȯ���ִ� �Լ� 
	public Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,id,pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//	Statement�� ��ȯ���ִ� �Լ�
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	// ����ϴ� �ڿ� ��ȯ���ִ� �Լ� 
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection)o).close();
			} else if(o instanceof Statement) {
				((Statement)o).close();
			} else if(o instanceof PreparedStatement) {
				((PreparedStatement)o).close();
			} else if(o instanceof ResultSet) {
				((ResultSet)o).close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
