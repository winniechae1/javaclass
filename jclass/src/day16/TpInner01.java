package day16;

public class TpInner01 {
	int num = 100;
	void abc() {
		System.out.println("TpInner01.num : " + num);
	}
	
	class GInner {	// �������� Ŭ���� 
		int no1 = 50;
		public GInner() {
			System.out.println("����� GInner()");
		}
	}
	
	static class TPCls {	//	ž��������Ŭ����
		int no2 = 5000;
		public void xyz() {
			System.out.println(" ����� TPCls ");
		}
	}
	
	void aaa() {
		class Aaa {	//	�������� Ŭ����
			public Aaa() {
				System.out.println(" ����� Aaa ");
			}
		}
		
		new Aaa();
	}
	
}
