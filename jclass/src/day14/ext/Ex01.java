package day14.ext;
/*
 	�� �������� �ۼ��� �ﰢ�� �簢�� �� Ŭ������ 10���� ����� 
 	�迭�� ����� �����ϰ� �� Ŭ������ �ν��Ͻ��� ä���� ����ϴ� 
 	���α׷��� �ۼ��ϼ���.
 */
import static java.lang.Math.*;
public class Ex01 {

	public Ex01() {
		Figure f1 = new Figure();
		Figure f2 = new Samgak();
		Figure f3 = new Rectangle();
		Figure f4 = new Circle();
	
	Figure[] f = new Figure[10];
	for(int i = 0; i < f.length; i++) {
		f[i] = getFigure();
	}
	for(Figure ff : f) {
		ff.toPrint();
	}
}
	public Figure getFigure() {
		Figure f = null;
		int no = (int)(Math.random() * 4);
		switch(no) {
		case 0:
			f = new Figure();
			break;
		case 1:
			f = new Samgak((int)(random() * 10)+ 1,(int)(random() * 10)+ 1);
			break;
		case 2:
			f = new Rectangle((int)(random() * 10)+ 1,(int)(random() * 10)+ 1);
			break;
		case 3:
			f = new Circle((int)(random() * 10) + 1);
			break;
		}
		return f;
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
