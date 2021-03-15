package day20;

import java.text.*;
public class Student {
	private String name;
	private int java, db, web, jsp, spring, total;
	private double avg;
	public Student() {
		
	}
	public Student(String name, int java, int db, int web, int jsp, int spring) {
		this.name = name;
		this.java = java;
		this.db = db;
		this.web = web;
		this.jsp = jsp;
		this.spring = spring;
		setTotal();
		setAvg();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = java + db + web + jsp + spring;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = total / 5.0;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	@Override 
	public String toString() {
		return name + " : java- " + java + ", db- " + db + ", web-" + web + ", jsp-" + jsp + ", spring-" + spring + ", total-" + total + ", avg-" + new DecimalFormat("#########.##").format(avg); 
	}
	@Override
	public boolean equals(Object o) {
		return name.equals(((Student) o).getName());
	}
	public void toPrint() {
		System.out.println(this);
	}
}
