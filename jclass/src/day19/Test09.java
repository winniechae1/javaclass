package day19;

import java.util.*;
public class Test09 {
	public ArrayList names, ages, gens, kees;
	public Test09() {
		setNames();
		setAges();
		setGens();
		setKees();
	}
//	names setting
	public void setNames() {
		//	ArrayList ����� 
		names = new ArrayList();
		//	������ ä��� 
		names.add("����");
		names.add("����");
		names.add("����");
		names.add("����");
		names.add("��������");
		names.add("�κ�");
		names.add("����");
		names.add("���");
		names.add("���");
		names.add("����Ű");
	}
	public void setKees() {
		kees = new ArrayList();
		kees.add(165.0);
		kees.add(130.0);
		kees.add(175.0);
		kees.add(175.0);
		kees.add(175.5);
		kees.add(175.5);
		kees.add(170.5);
		kees.add(168.0);
		kees.add(168.0);
		kees.add(180.0);
		kees.add(183.0);
		
	}
	
	public void setAges() {
		ages = new ArrayList();
		
		ages.add(34);
		ages.add(14);
		ages.add(54);
		ages.add(55);
		ages.add(76);
		ages.add(37);
		ages.add(34);
		ages.add(34);
		ages.add(146);
		ages.add(34);
	}
	
	public void setGens() {
		gens = new ArrayList();
		
		gens.add('M');
		gens.add('M');
		gens.add('M');
		gens.add('M');
		gens.add('F');
		gens.add('F');
		gens.add('F');
		gens.add('M');
		gens.add('M');
		gens.add('M');
	}


}
