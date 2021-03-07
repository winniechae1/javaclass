package chap05;

public class OverridingEx {

	public OverridingEx() {
		Child cd = new Child();
		System.out.println("cd : " + cd.getMsg());
		Parent pt = new Parent();
		System.out.println("pt : " + pt.getMsg());
		
	}

	public static void main(String[] args) {
		new OverridingEx();
	}

}
