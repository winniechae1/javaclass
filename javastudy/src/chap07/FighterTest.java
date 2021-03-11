package chap07;
//	[7-24]


class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		}
		if (f instanceof Fightable) {
			System.out.println("f�� Fightable�������̽��� �����մϴ�.");
		}
		if (f instanceof Movable) {
			System.out.println("f�� Movable�������̽��� �����մϴ�.");
		}
		if (f instanceof Attackable) {
			System.out.println("f�� Attackable�������̽��� �����մϴ�.");
		}
		if (f instanceof Object) {
			System.out.println("f�� Object�������̽��� �����մϴ�.");
		}
	}
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {
		
	}
	public void attack(Unit u) {
		
	}
}
class Unit {
	int currentHP;
	int x;
	int y;
}
interface Fightable extends Movable, Attackable { }

interface Movable { 
	void move(int x, int y);
}

interface Attackable {
	void attack(Unit u);
}

