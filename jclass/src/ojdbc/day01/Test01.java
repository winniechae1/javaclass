package ojdbc.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
/*
 	����Ŭ�� SCOTT ������ �����ؼ� emp ���̺��� ��� 1���� �����͸� ��ȸ�غ���.
 */
import java.util.Date;
public class Test01 {
/*
 	1. JDBC�� �ܺ� �����ͺ��̽��� ������ ����̹��� ���α׷����� ������ �;��Ѵ�. 
 		�ܺ� Ŭ������ �ε��ϴ� �Լ�
 		
 			Class.forName(���.Ŭ�����̸�)
 		�̶� �� ����̹����� �ܺ� Ŭ������ �̸��� ���ݾ� �ٸ���.
 		�� ��� �˻��ؼ� �ܺ� Ŭ�����̸��� ����ϸ� �ȴ�.
 	
 	2.	����Ŭ�� ������ �õ��Ѵ�.
 		������ �����ͺ��̽����� �����ϴ� ���(URL)�� �ణ�� �ٸ���.
 		
 		�����ϴ� ��ɾ�� JDBC���� ��ɸ� �ϸ� �ȴ�.
 		���Ӹ��]
 			DriverManager.getConnection();
 			
 		����Ŭ������ ������ ����(Session)�̶�� �ҷ����� JDBC������ Ŀ�ؼ��̶�� �θ���.
 		
 */
	public Test01() {
		try {
			 //	����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/*
			 	�ش� ����̹��� �̿��ؼ� ������ �õ��Ѵ�.
			 */
			System.out.println("����̹� �ε� ����");
			
			//	2. ���ӽõ�
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			String id = "SCOTT";
			String pw = "TIGER";
			
			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println("���� ���� ����");
			/*
			 	��ó�� ������ �ϸ� �����ڸ� �����ϴ� ������ �����ϰ� �ȴ�.
			 	�� ������ �����ϴ� Ŭ������ Connection �̴�.
			 */
			//	SCOTT ����� ������ ��ȸ�غ��� 
			
			Statement stmt = con.createStatement();
			//	���� ���Ǹ���� ��Ƽ� ���� ������ �غ� �ƴ�.
			
			String sql = "SELECT * FROM emp WHERE ename = 'SCOTT'";
			/*
			 	*****
			 	����]
			 		JDBC�� ���Ǹ���� ; ���� �������� �ʴ´� �־��ָ� ������ ����.
			 */
			//	Statement�� ���Ǹ���� �Ǿ JDBC�� �����Ѵ�.
			ResultSet rs = stmt.executeQuery(sql);
			/*
			 	����]
			 		ResultSet ==> ��ȸ ���Ǹ��(SELECT ���) �� ��ȸ����� �����ϴ� Ŭ����
			 */
			//	�����͸� ������ 
			
			rs.next();
			
			String name = rs.getString("ename");
			int eno = rs.getInt("empno");
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			int sal = rs.getInt("sal");
			int comm = rs.getInt("comm");
			int dno = rs.getInt("deptno");
			
			//	JDBC������ ��¥�� �ð��� ���� �������� �Լ����� ������� �ִ�.
			Date hdate = rs.getDate("hiredate");
			Time htime = rs.getTime("hiredate");
			
			//	��¥ �����͸� ���ڿ��� ��ȯ���ش�.
			SimpleDateFormat form1 = new SimpleDateFormat("yyyy��MM��dd�� ");
			SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
			
			String sdate = form1.format(hdate) + form2.format(htime);
			
			System.out.println("�����ȣ : " + eno);
			System.out.println("����̸� : " + name);
			System.out.println("������� : " + job);
			System.out.println("����ȣ : " + mgr);
			System.out.println("����޿� : " + sal);
			System.out.println("Ŀ�̼� : " + comm);
			System.out.println("�μ���ȣ : " + dno);
			System.out.println("�Ի��� : " + sdate);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Test01();
		
	}
	
}	
