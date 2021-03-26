package member.vo;

import java.sql.*;
import java.text.*;

/**
 * �� Ŭ������ ȸ�� �Ѹ� ���� ������ ����ϰ� ������ �뵵�� Ŭ����
 * @author	������
 * @since	2021.03.19
 * @version	v.1.0
 *
 */
public class MemberVO {
	private int mno, ano;
	private String name, id, pw, mail, tel, gen, savename, sdate;
	private Date jdate;
	private Time jtime;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
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
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getSavename() {
		return savename;
	}
	public void setSavename(String savename) {
		this.savename = savename;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy/MM/dd ");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		
		sdate = form1.format(jdate) + form2.format(jtime);
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public Date getJdate() {
		return jdate;
	}
	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}
	public Time getJtime() {
		return jtime;
	}
	public void setJtime(Time jtime) {
		this.jtime = jtime;
		setSdate();
	}
	@Override
	public String toString() {
		return "mno=" + mno + ", ano=" + ano + ", name=" + name + ", id=" + id + ", pw=" + pw + ", mail="
				+ mail + ", tel=" + tel + ", gen=" + gen + ", savename=" + savename + ", joindate=" + sdate ;
	}
}