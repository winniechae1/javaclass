package day11.ex;
/*
 	����3]
 		�ﰢ�� 5�� ����� �迭�� ����� 
 		�� �ﰢ���� ������ ����ϼ���.
 		��, �ﰢ���� ���� ���� ������ �Լ��� ���� ó���ϼ���.
 		(==> �����ڿ��� ó������ �ʵ��� �ϼ���. ����Լ��� �ﰢ�� Ŭ�������� 
 			�����س��� �Լ��� ȣ���ؼ� ó���ϵ��� �ϼ���.)
 */
public class Ex03 {
	
	public Ex03() {
		Tri[] tri = new Tri[5];
		
		for(int i = 0; i < tri.length; i++) {
			tri[i] = new Tri();
		}
		 
		for(int i = 0; i < tri.length; i++) {
			tri[i].garo();
			tri[i].sero();
		}
		for(Tri t : tri){
			t.toPrint();
		}
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
