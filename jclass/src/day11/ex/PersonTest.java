package day11.ex;

public class PersonTest {
	
	public PersonTest() {
		Person[] pa = new Person[10];
		
		for(int i = 0; i < pa.length; i++) {
			pa[i] = new Person();
		}
		
	}
	
	
	public static void main(String[] args) {
		new PersonTest();
	}

}
