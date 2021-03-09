package day16;

public class Test04 {
	
	public Test04() {
//		TpInner01.GInner gi01 = new TpInner01.GInner();
		TpInner01 t1 = new TpInner01();
		
		TpInner01.GInner gi01 = t1.new GInner();
		System.out.println("GInner.no1 : " + gi01.no1);
		
		System.out.println();
		
		//	Top Level Inner Class
		TpInner01.TPCls t2 = new TpInner01.TPCls();
		
		// 	지역 내부 클래스 
		TpInner01 t3 = new TpInner01();
//		TpInner01.Aaa A = t3.new Aaa();
	}
	
	public static void main(String[] args) {
		new Test04();
	}
}
