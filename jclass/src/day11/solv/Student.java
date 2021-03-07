package day11.solv;

public class Student {
	private String name, id, mail, tell;
	private char gen;
	
	
	
	//	출력될 함수 
	public String toString() {
		return "이 름 : "+ name +" 아이디 : "+ id + ", 메 일 : "+ mail +", 휴대폰 : "+ tell + ", 성 별 : " 
				 + ((gen == 'M') ? "남자" : "여자");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
}
