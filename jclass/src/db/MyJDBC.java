package db;
/*
 	이 클래스는 앞으로 JDBC 작업을 할 때 필요한 나만의 부품을 만들 예정이다.
 	
 	즉, JDBC 작업은 반복적인 작업이 많이 포함되어 있다.
 	이 작업을 좀 더 편하게 하기 위해서 나만의 부품을 만들어서 사용할 예정이다.
 	(==> 반복 작업을 자동으로 해주는 기능을 만들 예정)
 */
import java.sql.*;

public class MyJDBC {
	String url, id, pw;
	
	public MyJDBC() {
		// hello 계정으로 이 클래스를 객체로 만들어주는 생성자 함수 
		this("jdbc:oracle:thin:@localhost:1521:xe","hello","increpas");
	}
	public MyJDBC(String url,String id, String pw) {
		try {
			//	드라이버 로딩하고 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//	드라이버 로딩에 실패한 경우는 이 클래스가 쓸모없어지는 경우일 것이다.
			//	따라서 url, id, pw 도 기억하는 작업도 필요없게 된다.
			//	드라이버가 로딩이 성공하면 기억하도록 코딩하도록 한다.
			this.url = url;
			this.id = id;
			this.pw = pw;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//	Connection을 반환해주는 함수 
	public Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,id,pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//	Statement을 반환해주는 함수
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
	
	// 사용하던 자원 반환해주는 함수 
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
