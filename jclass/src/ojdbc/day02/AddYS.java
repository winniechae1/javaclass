package ojdbc.day02;
/*
 	hello 계정의 member 테이블에 박용수 회원을 추가하세요
 	이름 : 박용수
 	id : ys
 	pw : 12345
 	mail : ys@increpas.com
 	tel : 010-8888-8888
 	gen : 'M'
 	avt : 12
 */
import java.sql.*;
public class AddYS {
	 Connection con;
	 PreparedStatement pstmt;
	 
	public AddYS() {
		
	 	 MemberVO ys = new MemberVO();
	 	 ys.setName("김기은");
	 	 ys.setId("kieun");
	 	 ys.setPw("12345");
	 	 ys.setMail("kieun@increpas.com");
	 	 ys.setTel("010-5555-5555");
	 	 ys.setGen("M");
	 	 ys.setAno(13);
	 
	 	 try {
	 		 Class.forName("oracle.jdbc.driver.OracleDriver");
	 		 String url ="jdbc:oracle:thin:@localhost:1521:xe";
	 		 String id = "hello";
	 		 String pw = "increpas";
	 		 con = DriverManager.getConnection(url, id, pw);
	 		 
	 		 
	 		 //	질의명령 작성
	 		 StringBuffer buff = new StringBuffer();
	 		 buff.append("INSERT INTO ");
	 		 buff.append("		member(mno,name,id,pw,mail,tel,gen,avt) ");
	 		 buff.append("VALUES( ");
	 		 buff.append("		(SELECT NVL(MAX(mno) + 1, 1001) FROM member), ");
	 		 buff.append("		?, ?, ?, ?, ?, ?, ? ");
	 		 buff.append(")");
	 		 
	 		 String sql = buff.toString();
	 		 
	 		 //	PreparedStatement 준비하고 
	 		 pstmt = con.prepareStatement(sql);
	 		 /*
	 		  	pstmt 는 전달하는 질의명령의 구조만 가지고 있다. 따라서 질의명령을 실행할 때는 데이터들이 채워져야 질의명령이 완성이 될 것이다.
	 		  	결국 질의명령을 보내기 직전에 데이터를 채워서 질의명령을 완성시켜줘야 한다.
	 		  */
	 		 
	 		 //	질의 명령 완성하기 (데이터 채우기)
	 		 /*
	 		  	데이터를 채울때 위치값은 ?의 순서를 쓰면 된다.
	 		  	데이터 타입은 자바에서 사용하는 타입을 쓰면 된다.
	 		  */
	 		 pstmt.setString(1, ys.getName());
	 		 pstmt.setString(2, ys.getId());
	 		 pstmt.setString(3, ys.getPw());
	 		 pstmt.setString(4, ys.getMail());
	 		 pstmt.setString(5, ys.getTel());
	 		 pstmt.setString(6, ys.getGen());
	 		 pstmt.setInt(7, ys.getAno());
	 		 
	 		 //	질의명령이 완성됐으므로 전달하면 된다.
	 		 int cnt = pstmt.executeUpdate();
	 		 //	이때 pstmt에는 완성된 질의명령이 들어있으므로 
	 		 //	함수 호출 시 질의명령을 입력하지 않아도 된다.
	 		 
	 		 if(cnt == 1) {
	 			 System.out.println("막둥이 가입성공");
	 		 } else {
	 			 System.out.println("막둥이 가입실패");
	 		 }
	 		 
	 	 } catch(Exception e) {
	 		 e.printStackTrace(); 
	 	 } finally {
	 		 try {
	 			 pstmt.close();
	 			 con.close();
	 		 } catch(Exception e) {}
	 	 }
	 	 
	}

	public static void main(String[] args) {
		new AddYS();
	}

}
