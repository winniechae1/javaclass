package day13;

public class TestVO {
	private String sno, name;
	private int[] num;
	
	public TestVO() {
		sno = "0000";
		name = "noname";
		num = new int[5];
		/*
		 	��ó�� �� Ŭ������ ��ü�� �ɶ� �⺻���� ���׵��� ������ �� �ʿ䰡 ���� �� 
		 	�� �۾��� ���ִ� �Լ��� ������ �Լ��̴�.
		 */
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getNum() {
		return num;
	}
	public void setNum(int[] num) {
		this.num = num;
	}
}
